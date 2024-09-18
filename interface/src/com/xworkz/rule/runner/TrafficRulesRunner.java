package com.xworkz.rule.runner;

import com.xworkz.rule.implement.VehicleRules;
import com.xworkz.rule.internal.TrafficRules;
import com.xworkz.rule.internal.TrafficPolice;

public class TrafficRulesRunner {

	public static void main(String[] args) {
		TrafficRules trafficRules= new VehicleRules();
		TrafficPolice trafficPolice = new TrafficPolice();
		trafficPolice.setTrafficRules(trafficRules);
		trafficPolice.display();
		System.out.println(trafficRules.licenceNo());

	}
 
}
