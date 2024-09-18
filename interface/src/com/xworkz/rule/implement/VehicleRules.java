package com.xworkz.rule.implement;

import com.xworkz.rule.internal.TrafficRules;

	public class VehicleRules implements TrafficRules{

		@Override
		public String licenceNo() {
			System.out.println("implementation of licenceNo in VehicleRules");
       return "DL5268938390";
		}

	}


