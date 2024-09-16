package com.xworkz.rule.implement;
import com.xworkz.rule.internal.TrafficRule;

public class GovtTrafficRule implements TrafficRule{

	@Override
	public int ruleId() {
		System.out.println("running ruleId");
		return 34;
	}

	@Override
	public String description() {
		System.out.println("running description");
		return null;
	}

	@Override
	public double speedLimit() {		
		System.out.println("running speedLimit");
		return 70;
		
	}

	@Override
	public boolean enforced() {
		System.out.println("running enforced");
		return true;
	}

	@Override
	public float penaltyAmount() {
		System.out.println("running penaltyAmount");
		return 1500;
	}

	@Override
	public String allowedVehicles() {
		System.out.println("running allowedVehicles");
		return null;
	}

	@Override
	public String timeRestrictions() {
		System.out.println("running timeRestrictions");
		return null;
	}

	@Override
	public int maxParkingDuration() {
		System.out.println("running maxParkingDuration");
       return 4;
	}

	@Override
	public double locationCoordinates() {
		System.out.println("running locationCoordinates");
       return 20;
	}

	@Override
	public int numberOfViolations() {
		System.out.println("running numberOfViolations");
		return 0;
	}

	@Override
	public byte penaltyPoints() {
		System.out.println("running penaltyPoints");
		return 50;
	}

	@Override
	public String requiredDocuments() {
		System.out.println("running requiredDocuments");
		return null;
	}

	@Override
	public String advisoryNotices() {
		System.out.println("running advisoryNotices");
		return null;
	}
}




