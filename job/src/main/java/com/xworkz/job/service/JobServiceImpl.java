package com.xworkz.job.service;

import com.xworkz.job.dto.JobDTO; 


public class JobServiceImpl implements JobService{

	@Override
	public boolean validateAndSave(JobDTO jobDTO) {
		System.out.println("start validating JobDTO in service");
		
		boolean valid=true;
		
		if(jobDTO!=null) {
			System.out.println("job DTO is not null,will validate the data");
			String name =jobDTO.getName();
			if(name !=null && !name.isEmpty() && name.length()>=4 
					&& name.length() <=30) {
			System.out.println("Name is valid");
		}
		else {
			System.err.println("Name is Invalid");
			valid=false;
		}
			String email =jobDTO.getEmail();
			if(email !=null && !email.isEmpty() && email.contains("@")  
					&& (email.endsWith(".com") || email.endsWith(".in") )) {
			System.out.println("Email is valid");
		}
		else{ 
			
			System.err.println("Email is Invalid");
			valid=false;
		}
			String yop =jobDTO.getYop();
			int convertedYop =Integer.valueOf(yop);
			if (convertedYop > 2020) {
				System.out.println("Valid Yop");
			}
			else{ 
				
				System.err.println("Invalid Yop");
				valid=false;
		}
			double salaryExpectations = jobDTO.getSalaryExpectation();
			if(salaryExpectations > 0)
			{
				System.out.println("Valid");
			}
		}
		return false;
	}

}
