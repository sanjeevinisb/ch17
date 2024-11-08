package com.xworkz.registration.service;

import com.xworkz.registration.dto.RegistrationDTO;

public interface RegistrationService {


		boolean validateAndSave(RegistrationDTO dto);
		
		}


