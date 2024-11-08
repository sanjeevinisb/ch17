package com.xworkz.registration.service;

import com.xworkz.registration.dto.RegistrationDTO; 

public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public boolean validateAndSave(RegistrationDTO dto) {
		System.out.println("running validateAndSave");
		boolean checkValid = true;
		
		if (dto != null) {
		String name = dto.getName();
		if (name != null && !name.isEmpty() && (name.length() > 3 && name.length() < 30)) {
		System.out.println("Valid Name ");
		} else {
		System.err.println("Invalid Name");
		checkValid = false;
		}
		}

		if (dto != null) {
		String email = dto.getEmail();
		if (email != null && !email.isEmpty() && (email.endsWith(".com") || email.endsWith(".in"))) {
		System.out.println("Valid Email ");
		} else {
		System.err.println("Invalid Email");
		checkValid = false;
		}
		}
		
		int age =dto.getAge();
		int convertedAge =Integer.valueOf(age);
		if (convertedAge > 18) {
			System.out.println("Valid Age");
		}
		else{ 
			
			System.err.println("Invalid Age");
			checkValid=false;
	}
	

		return checkValid;
		}

}


	
			