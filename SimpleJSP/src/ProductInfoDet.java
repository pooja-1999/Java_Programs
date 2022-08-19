

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductInfoDet
 */
@WebServlet("/ProductInfoDet")
public class ProductInfoDet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInfoDet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
        String pdname = request.getParameter("name");
        int pdprice = Integer.parseInt(request.getParameter("price"));
        
        if (id < 0 || pdname == null || pdname.equals("") || pdprice <= 0) {
                response.sendRedirect("ProductDetails.jsp?error=1");
        } 
        else
        {	
        	
        	out.println("Product Id: "+id +"<br>");
         	out.println("Product Name: "+pdname +"<br>");
        	out.println("Product Price: Rs."+pdprice);
        }
        
	}

}
