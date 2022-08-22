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
 * Servlet implementation class confirm
 */
public class confirm extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public confirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int n=Integer.parseInt(request.getParameter("id"));
		int k=Integer.parseInt(request.getParameter("seats"));

		PrintWriter out = response.getWriter();
		try {
            
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           String query = "select * from availableflights where Id=? ";
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           PreparedStatement stmt = conn.getConnection().prepareStatement(query);
           
           stmt.setInt(1,n);
           
           ResultSet rst = stmt.executeQuery();
           ArrayList<Float> al=new ArrayList<Float>();
           out.println("<h2>Your Selected Flight detail</h2><br><br>");
           
           out.println("<table border=1 width=50% height=50%>"); 
           out.println("<tr><th>Code value</th><th>Source</th><th>Destination</th><th>Flight Name</th><th>Flight Number</th><th>Date</th><th>Ticket Price</th><tr>"); 
           
           while (rst.next()) {
                   
                   int i = rst.getInt("Id");
                   String s = rst.getString("Source");
                   String d = rst.getString("Destination");
                   String fn = rst.getString("FlightName");
                   String fo = rst.getString("FlightNumber");
                   String dt = rst.getString("Date");
                   float p = rst.getFloat("price");
                   al.add(p);
                   out.println("<tr><td>"+ i + "</td><td>" + s + "</td><td>" + d + "</td><td>" + fn + "</td><td>"  + fo + "</td><td>" + dt + "</td><td>" + p +  "</td></tr>");   
               }  
               out.println("</table><br><br>");
               out.println("<h3>Total Amount you have to pay: "+k*al.get(0)+"</h3><br><br>");
               out.println("<a href='person.html'>Confirm</a><br>");
               
               out.println("</html></body>");  
           
           
           stmt.close();
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
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
