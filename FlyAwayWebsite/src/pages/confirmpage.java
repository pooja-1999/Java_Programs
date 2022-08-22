package pages;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class confirmpage
 */
public class confirmpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public confirmpage() {
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
		String name = request.getParameter("name");
		int Age = Integer.parseInt(request.getParameter("age")); 
		String Phno =request.getParameter("phno");
		String Email=request.getParameter("email");
		String G =request.getParameter("gender");
		String idp=request.getParameter("idproof");
		String idno=request.getParameter("idno");
		PrintWriter out = response.getWriter();
		
		out.println("<h1><font color='blue'>Your booking is confirmed!!!</font></h1>");
		
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
           
           out.println("<h2>Your Flight details</h2><br><br>");  
           out.println("<table border=1 width=50% height=50%>"); 
           out.println("<tr><th>Source</th><th>Destination</th><th>Flight Name</th><th>Flight Number</th><th>Date</th><th>Ticket Price</th><tr>"); 
           
           while (rst.next()) {
                   
                   
                   String s = rst.getString("Source");
                   String d = rst.getString("Destination");
                   String fn = rst.getString("FlightName");
                   String fo = rst.getString("FlightNumber");
                   String dt = rst.getString("Date");
                   float p = rst.getFloat("price");
                   
                   out.println("<tr><td>" + s + "</td><td>" + d + "</td><td>" + fn + "</td><td>"  + fo + "</td><td>" + dt + "</td><td>" + p +  "</td></tr>");   
               }
           			
               	out.println("</table><br><br>");
               	
               	out.println("<h2> Personal Details: </h2>");
               	out.print("Name: "+name+"<br>");
       			out.print("Age: "+Age+"<br>");
       			out.print("Phone Number: "+Phno+"<br>");
       			out.print("Email Address: "+Email+"<br>");
       			out.print("Gender: "+G+"<br>");
       			out.print("ID Proof: "+idp+"<br>");
       			out.print("ID Proof Details: "+idno+"<br>");
       			out.println("<h2><font color='blue'>Thank You</font></h2>");  
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
