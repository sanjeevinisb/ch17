package com.xworkz.ticket.serviceimpl;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.repo.TicketRepository;
import com.xworkz.ticket.repo.TicketRepositoryImpl;
import com.xworkz.ticket.service.TicketService;

public  class TicketServiceImpl implements TicketService {
	
	@Override
    public boolean isValidAndSave(TicketDto ticketDto){

        boolean valid=true;
        
        String email =ticketDto.getEmail();
		if(email !=null && !email.isEmpty() && email.contains("@")  
				&& (email.endsWith(".com") || email.endsWith(".in") )) {
		System.out.println("Email is valid");
	}
	else{ 
		
		System.err.println("Email is Invalid");
		valid=false;
	}
	

        int tickets=ticketDto.getTicket();
		if(tickets>0 && tickets<10) {
			System.out.println("tickets is valid");
		}
		else {
			System.out.println("tickets is not valid");
			valid=false;
		}
			
		long primaryContact=ticketDto.getContact();
		if(primaryContact>=10) {
			System.out.println("primaryContact is valid");
		}
		else {
			System.out.println("primaryContact is not valid");
			valid=false;
		}
        
        if((ticketDto.getEmail()==null||!ticketDto.getEmail().contains("@")||!(ticketDto.getEmail().endsWith(".com")||ticketDto.getEmail().endsWith(".in"))))
        {
            System.err.println("invalid email format");
            valid= false;
        }

    
		if(valid)
		{
			System.out.println("save date into database");
			TicketRepository repository = new TicketRepositoryImpl();
			int pk=repository.save(ticketDto);
			if(pk>0)
			{
				System.out.println("data saved into database");
				valid=true;
			}
			else {
				System.out.println("data not saved into database");
				valid=false;
			}
		}
			return valid;
		}

}

    

