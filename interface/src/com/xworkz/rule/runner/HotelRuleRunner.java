package com.xworkz.rule.runner;

import com.xworkz.rule.implement.CanaraHotelRule;
import com.xworkz.rule.internal.FoodSafetyDepartment;
import com.xworkz.rule.internal.HotelRule;

public class HotelRuleRunner {

	public static void main(String[] args) {
		HotelRule hotelRule= new CanaraHotelRule();
		FoodSafetyDepartment foodSafetyDepartment = new FoodSafetyDepartment();
		foodSafetyDepartment.setHotelRule(hotelRule);
		foodSafetyDepartment.inspection();
	}

}
