package com.xworkz.ticket.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.service.TicketService;
import com.xworkz.ticket.serviceimpl.TicketServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class TicketServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		TicketDto ticketDto = new TicketDto();
		ticketDto.setName(req.getParameter("name"));
		ticketDto.setTicket(Integer.parseInt(req.getParameter("ticket")));
		ticketDto.setContact(Long.parseLong(req.getParameter("contact")));
		ticketDto.setEmail(req.getParameter("email"));
		
		TicketService ticketService = new TicketServiceImpl();
		boolean validationOfDTO = ticketService.isValidAndSave(ticketDto);
		if (validationOfDTO) {
			System.out.println("valid data");

			RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
			req.setAttribute("stadiumName", ticketDto.getName());
			req.setAttribute("Success", "Ticket booked!!");
			dispatcher.forward(req, resp);

		} else {
			System.out.println("invalid data");
			RequestDispatcher dispatcher = req.getRequestDispatcher("ticket.jsp");
			req.setAttribute("Ticket", "Booking Failed!!");
			dispatcher.forward(req, resp);

		}

	}

}
