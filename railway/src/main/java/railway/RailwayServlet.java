package railway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/railway")
public class RailwayServlet extends HttpServlet {
	public RailwayServlet() {
		System.out.println("Created RailwayServlet....");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in RailwayServlet");
 
		String name = req.getParameter("name");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		String startDate = req.getParameter("startDate");
		String returnDate = req.getParameter("returnDate");
		String seatType = req.getParameter("seatType");
		String totalTicket = req.getParameter("totalTicket");
		String NoOfMale = req.getParameter("NoOfMale");
		String NoOfFemale = req.getParameter("NoOfFemale");

		System.out.println("name :" + name);
		System.out.println("source :" + source);
		System.out.println("destination :" + destination);
		System.out.println("startdate :" + startDate);
		System.out.println("returndate :" + returnDate);
		System.out.println("seattype :" + seatType);
		System.out.println("totalticket  :" + totalTicket);
		System.out.println("Noofmale :" + NoOfMale);
		System.out.println("Nooffemale :" + NoOfFemale);

		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<html>");
		printWriter.println("<head>");
		printWriter.println("<title>" + "X-workz" + "</title>");
		printWriter.println("</head>");
		printWriter.println("<body>");

		printWriter.println("<h4>name:" + name);
		printWriter.println("</h4>");

		printWriter.println("<h4>source:" + source);
		printWriter.println("</h4>");

		printWriter.println("<h4>destination:" + destination);
		printWriter.println("</h4>");

		printWriter.println("<h4>startDate:" + startDate);
		printWriter.println("</h4>");

		printWriter.println("<h4>returnDate:" + returnDate);
		printWriter.println("</h4>");

		printWriter.println("<h4>seatType:" + seatType);
		printWriter.println("</h4>");

		printWriter.println("<h4>totalTicket:" + totalTicket);
		printWriter.println("</h4>");

		printWriter.println("<h4>NoOfMale:" + NoOfMale);
		printWriter.println("</h4>");

		printWriter.println("<h4>NoOfFemale:" +NoOfFemale);
		printWriter.println("</h4>");

		printWriter.println("</html>");
		printWriter.println("Ticket Booked Successfully");
		resp.containsHeader("railway.html");

	}

}