package com.xworkz.constantsrunner;
import com.xworkz.constantsDTO.TicketBookDTO;
import com.xworkz.constants.TicketType;
import com.xworkz.constants.SeatType;


public class TicketBookRunner {

	public static void main(String[] args) {
		        
		        TicketBookDTO ticket =
		        		new TicketBookDTO("Ibbani Tabbida Ileyali", "PVR Theater", TicketType.ONLINE, SeatType.RECLINER);
		        ticket.ticketInfo();
		    }

	}


