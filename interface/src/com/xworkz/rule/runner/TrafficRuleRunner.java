package com.xworkz.rule.runner;

import com.xworkz.rule.internal.TrafficRule;
import  com.xworkz.rule.implement.GovtTrafficRule;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		TrafficRule traffic=new GovtTrafficRule();
		System.out.println(traffic.ruleId());
		System.out.println(traffic.description());
		System.out.println(traffic.speedLimit());
		System.out.println(traffic.enforced());
		System.out.println(traffic.penaltyAmount());
		System.out.println(traffic.allowedVehicles());
		System.out.println(traffic.timeRestrictions());
		System.out.println(traffic.maxParkingDuration());
		System.out.println(traffic.locationCoordinates());
		System.out.println(traffic.numberOfViolations());
		System.out.println(traffic.requiredDocuments());
	}
}
