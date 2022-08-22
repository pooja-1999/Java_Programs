package pages;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
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
 * Servlet implementation class validcheck
 */
public class validcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String n=request.getParameter("id");
		String p=request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		try {
            
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           ArrayList<String> al=new ArrayList<String>();
           ResultSet rst = stmt.executeQuery("select * from passwords");
           while (rst.next()) {
        	al.add(rst.getString("passwords"));
           	}
           String password = al.get(0);
   		   RequestDispatcher rd;
   		   if(n.equals("username") && password.equals(p)){
   			   HttpSession session=request.getSession(true);
   			   session.setAttribute("username", n);
   			   rd=request.getRequestDispatcher("adminlistpage.html");
   			   rd.forward(request, response);
   		   	}
   		   else {
   			out.println("<SPAN style='color:red'>Invalid Username or Password. Try again!!!</SPAN>");
   			rd=request.getRequestDispatcher("logincheck.html");
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
