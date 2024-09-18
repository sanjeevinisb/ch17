package com.xworkz.rule.internal;

public class TrafficPolice {
	private TrafficRules trafficRules;
	public void setTrafficRules(TrafficRules trafficRules) 
	{
		this.trafficRules=trafficRules;
	}
	public void display() {
		System.out.println("running display in TrafficPolice");
		if(trafficRules!=null) {
		System.out.println("trafficRules is not null");
		trafficRules.licenceNo();
	}else {
		System.out.println("trafficRules is null");
	}
		
		
	}
	}


