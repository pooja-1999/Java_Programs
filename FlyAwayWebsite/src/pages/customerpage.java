package pages;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class customerpage
 */
public class customerpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String n=request.getParameter("Source");
		String p=request.getParameter("Destination");
		String d=request.getParameter("Date");
		PrintWriter out = response.getWriter();
		if(n.equals(p))
		{
			RequestDispatcher rd;
			out.println("<SPAN style='color:red'>Source and destination cannot be same!!!</SPAN>");
			rd=request.getRequestDispatcher("customer.html");
   			rd.include(request, response);
			}
		
	else{	
		try {
            
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           String query = "select * from availableflights where Source=? and Destination=? and Date=?";
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           PreparedStatement stmt = conn.getConnection().prepareStatement(query);
           
           stmt.setString(1,n);
           stmt.setString(2,p);
           stmt.setString(3,d);
           ResultSet rst = stmt.executeQuery();
           out.println("<table border=1 width=50% height=50%>"); 
           out.println("<tr><th>CODE VALUE</th><th>Source</th><th>Destination</th><th>Flight Name</th><th>Flight Number</th><th>Date</th><th>Ticket Price</th><tr>"); 
           ArrayList<Integer> al=new ArrayList<Integer>();  
           if (rst.next() == false)
        	   {out.println("<SPAN style='color:red'><h2>No flights are available right now!!!</SPAN><h2>");}
           else{
        	   do{
          
                   
                   int id = rst.getInt("Id");
                   String so = rst.getString("Source");
                   String des = rst.getString("Destination");
                   String fn = rst.getString("FlightName");
                   String fo = rst.getString("FlightNumber");
                   String dt = rst.getString("Date");
                   double pr = rst.getFloat("price");
                   al.add(id);
                   out.println("<tr><td>" + id + "</td><td>" + so + "</td><td>" + des + "</td><td>" + fn + "</td><td>"  + fo + "</td><td>" + dt + "</td><td>" + pr +  "</td></tr>");   
               } while (rst.next()); 
           }
          
               out.println("</table>");
               out.println("<br><br>");
               out.println("Enter the corresponding CODE VALUE of the flight you want to book from: ");
               out.println(al);
               out.println("<form action ='confirm' method = get>");
               out.println("<br><input type='text' name='id'><br><br>");
               out.println("Enter the number of seats you want to book");
               out.println("<br><input type='text' name='seats'><br><br><button>Submit</button>");
               out.println("</form>");
               
               out.println("</html></body>");  
           
           stmt.close();
           
           conn.closeConnection();
           
   } 
		catch (ClassNotFoundException e) {
           e.printStackTrace();
   } 
		catch (SQLException e) {
           e.printStackTrace();
   }
	}
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
