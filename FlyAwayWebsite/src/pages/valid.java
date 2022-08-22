package pages;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class valid
 */
public class valid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public valid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String n=request.getParameter("username");
		String p=request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		try {
            
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           String str = "update passwords set passwords=? where Id = 1";
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           PreparedStatement stmt = conn.getConnection().prepareStatement(str);
           stmt.setString(1,p);
           int i = stmt.executeUpdate();
   		   RequestDispatcher rd;
   		   if(i>0){
   			   out.println("<SPAN style='color:blue'><h4>Password Updated!!!</h4></SPAN>");
   			   rd=request.getRequestDispatcher("adminlistpage.html");
   			   rd.include(request, response);
   		   	}
   		   else {
   			out.println("<SPAN style='color:red'>Password Not Updated. Try again!!!</SPAN>");
   			rd=request.getRequestDispatcher("passwordpage.html");
   			rd.include(request, response);
   			}
           stmt.close();
           out.println("</body></html>");
           conn.closeConnection();
           
   } 
		catch (ClassNotFoundException e) {
           e.printStackTrace();
   } 
		catch (SQLException e) {
           e.printStackTrace();
   }
		
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
	}
	

}
