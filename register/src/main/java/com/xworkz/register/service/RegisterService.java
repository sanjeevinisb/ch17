package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterDTO;

public interface RegisterService {

		boolean validateAndSave(RegisterDTO dto);
		
		}

