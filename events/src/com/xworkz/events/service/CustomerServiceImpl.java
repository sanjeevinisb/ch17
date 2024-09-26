package com.xworkz.events.service;
import com.xworkz.events.exception.InvalidAmountException;
import com.xworkz.events.exception.InvalidEmailException;

public class CustomerServiceImpl {
	public void save(String email)throws InvalidEmailException
	{
		
		System.out.println("running save in CustomerServiceImpl");
		
		if(email == null  || email.equals(""))
		{

			System.out.println("invalid email, will stop the execution");
			throw new InvalidEmailException(); 
		}
		
		System.out.println("valid email, will continue the execution");
	}
	
	public void checkAmount(int Amount)
	{
		if(Amount>0 && Amount <=100)
		{
			System.out.println("valid Amount........");
		}
		else { throw new InvalidAmountException(); 
		
		}
	}

}
