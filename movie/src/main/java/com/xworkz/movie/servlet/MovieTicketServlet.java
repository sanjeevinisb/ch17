package com.xworkz.movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.movie.dto.MovieTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/book show")

	public class MovieTicketServlet extends HttpServlet{
		public MovieTicketServlet() {
			System.out.println("Created no-arg const of MovieTicketServlet");
		
		}

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running service in MovieTicketServlet...");
			String name = req.getParameter("name");
			String tickets = req.getParameter("tickets");
			String theater = req.getParameter("theater");
			String seatType = req.getParameter("seatType");
			String donation = req.getParameter("donation");
			String date = req.getParameter("date");
			int convertedTickets = Integer.valueOf(tickets);
			double convertedDonation = Double.valueOf(donation);
		
			System.out.println("Name:"+name);
			System.out.println("Tickets:"+tickets);
			System.out.println("Theater:"+theater);
			System.out.println("SeatType:"+seatType);
			System.out.println("Donation:"+donation);
			System.out.println("Date:"+date);
			
			PrintWriter printerWriter=resp.getWriter();
			printerWriter.println("success in sending Data");
			
			MovieTicketDTO movieTicketDTO = new MovieTicketDTO(name,convertedTickets,theater,seatType,convertedDonation,date);
			System.out.println("MovieTicketDTO:" + movieTicketDTO);
			

		}


	}

