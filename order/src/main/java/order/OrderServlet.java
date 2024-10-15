package order;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
	@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
	public class OrderServlet extends HttpServlet {

	public OrderServlet() {
	System.out.println("Created OrderServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running service in OrderServlet...");
	String customerName=req.getParameter("customerName");
	String item=req.getParameter("item");
	String quantity=req.getParameter("quantity");
	String password=req.getParameter("password");
	System.out.println("CustomerName:"+customerName);
	System.out.println("Item:"+item);
	System.out.println("Quantity:"+quantity);
	System.out.println("Password:"+password);
	
	PrintWriter printerWriter=resp.getWriter();
	printerWriter.println("Order is success");
	
	}

}
