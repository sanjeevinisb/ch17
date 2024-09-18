package com.xworkz.rule.implement;

import com.xworkz.rule.internal.HotelRule;

public class CanaraHotelRule implements HotelRule{

	@Override
	public boolean cleanPremises() {
		System.out.println("implementation of cleanPremises in CanaraHotelRule");
		return true;
	}

}
