package loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCheck
 */
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		//RequestDispatcher- an interface to include content on same page or different pages
		
		
		
		
		RequestDispatcher rd;
		if(name.equalsIgnoreCase("username") && password.equals("password123")){
			
			HttpSession session=request.getSession(true);
			out.println("session id="+session.getId());
			session.setAttribute("username", name);
			
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			out.println("<SPAN style = 'colour=red'>Invalid Username or Password</SPAN>");
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

		

}
