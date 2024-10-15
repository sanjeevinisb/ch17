package order;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 1,urlPatterns = "/search")
	public class SearchServlet extends HttpServlet {

	public SearchServlet() {
	System.out.println("Created SearchServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running service in SearchServlet...");
	String email=req.getParameter("email");
	System.out.println("Email:"+email);
	
	PrintWriter printerWriter=resp.getWriter();
	printerWriter.println("Search is success");
	
}
	}
