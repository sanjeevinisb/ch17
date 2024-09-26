package com.xworkz.events.runner;

import com.xworkz.events.exception.InvalidEmailException;
import com.xworkz.events.service.CustomerServiceImpl;

public class ExceptionRunner {

	public static void main(String[] args)throws InvalidEmailException
	{

		
		CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
		System.out.println("running before check amount");
		customerServiceImpl.checkAmount(10); 
		System.out.println("running after check amount");
		
		System.out.println("running before email method");
		customerServiceImpl.save("sanjeevini@gmail.com");
		System.out.println("running after email method");
		
		


	}
		
	}

