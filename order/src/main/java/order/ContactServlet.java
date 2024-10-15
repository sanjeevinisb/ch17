package order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet(loadOnStartup = 1,urlPatterns = "/contact")
	public class ContactServlet extends HttpServlet {

	public ContactServlet() {
	System.out.println("Created ContactServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running service in ContactServlet...");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String age=req.getParameter("age");
	String mobileNumber=req.getParameter("mobileNumber");
	String address=req.getParameter("address");
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Age:"+age);
	System.out.println("Mobile Number:"+mobileNumber);
	System.out.println("Address:"+address);
	
	PrintWriter printerWriter=resp.getWriter();
	printerWriter.println("Contact is success");
	
	}
}
