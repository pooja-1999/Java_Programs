

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
 * Servlet implementation class Example
 */
public class Example extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			PrintWriter out = response.getWriter();
		    out.println("<html><body>");
		    
		   InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		   Properties props = new Properties();
		   props.load(in);
		   String name = "password";
		   DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
		   Statement stmt = conn.getConnection().createStatement();
		   stmt.executeUpdate("update passwords where Id=1");
		   ResultSet rst = stmt.executeQuery("select * from passwords");
		   
		   while (rst.next()) {
			   out.println(rst.getInt("Id") + ", " + rst.getString("passwords") + "<Br>");
		   }
		  
		   //out.println();
		   stmt.close();
		   out.println("</body></html>");
		   conn.closeConnection();
				
			}
			 catch (ClassNotFoundException e) {
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
		//doGet(request, response);
		

}}

	

