package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;  

public class RegisterServiceImpl implements RegisterService {

		@Override
		public boolean validateAndSave(RegisterDTO dto) {

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

		return checkValid;
		}

		}

