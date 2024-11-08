package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDTO;  
import com.xworkz.college.internal.CollegeService;

public class CollegeServiceImpl implements CollegeService{


	@Override
	public boolean validateAndSave(CollegeDTO collegeDTO) {
		System.out.println("start validating CollegeDTO in service");
		 
		boolean valid=true;
		
		if(collegeDTO!=null) {
			System.out.println("college DTO is not null,will validate the data");
			String name =collegeDTO.getName();
			if(name !=null && !name.isEmpty() && name.length()>=4 
					&& name.length() <=30) {
			System.out.println("Name is valid");
		}
		else {
			System.err.println("Name is Invalid");
			valid=false;
		}
		
		
		String email =collegeDTO.getEmail();
		if(email !=null && !email.isEmpty() && email.contains("@")  
				&& (email.endsWith(".com") || email.endsWith(".in") )) {
		System.out.println("Email is valid");
	}
	else{ 
		
		System.err.println("Email is Invalid");
		valid=false;
	}

long mobile= collegeDTO.getMobile();
long convertedMobile = Long.valueOf(mobile);
if (convertedMobile > 10)
{
	System.out.println("valid Mobile");
}
else {
	System.err.println("Invalid Mobile");
	valid=false;

}


int age= collegeDTO.getAge();
int convertedAge = Integer.valueOf(age);
if (convertedAge > 18)
{
	System.out.println("valid Age");
}
else {
	System.err.println("Invalid Age");
	valid=false;

}

double percentage= collegeDTO.getPercentage();
double convertedPercentage = Double.valueOf(percentage);
if (convertedPercentage > 65)
{
	System.out.println("valid Percentage");
}
else {
	System.err.println("Invalid Percentage");
	valid=false;

}

	}
		return false;
	}
}



