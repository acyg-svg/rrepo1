package sise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet(
		urlPatterns = { "/third" }, 
		initParams = { 
				@WebInitParam(name = "userName", value = "陈奕耿"), 
				@WebInitParam(name = "password", value = "1840706138")
		})
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=utf-8");
	        PrintWriter out =response.getWriter();
	        ServletContext context = this.getServletContext();
	        Enumeration<String> paramNames = context.getInitParameterNames();
	         while (paramNames.hasMoreElements()) {
	        	 String name = paramNames.nextElement();
	        	 String value = context.getInitParameter(name);
	        	 out.println(name + ":" + value);
	        	 out.println("<br />");
	         }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
