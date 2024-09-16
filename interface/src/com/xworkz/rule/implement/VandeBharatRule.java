package com.xworkz.rule.implement;

import com.xworkz.rule.internal.RailwayStationRule;


public class VandeBharatRule implements RailwayStationRule {
	
	@Override
	public String ruleDescription() {
		System.out.println("running ruleDescription");
		return null;
	}

	@Override
	public int ruleId() {
		System.out.println("running ruleId");
		return 16;
	}

	@Override
	public boolean mandatory() {
		System.out.println("running mandatory");
		return true;
	}

	@Override
	public double fineAmount() {
		System.out.println("running fineAmount");
		return 1000;
	}

	@Override
	public char severityLevel() {
		System.out.println("running severityLevel");
		return 0;
	}

	@Override
	public long ruleEffectiveDate() {
		System.out.println("running ruleEffectiveDate");
		return 0;
	}

	@Override
	public float complianceRate() {
		System.out.println("running complianceRate");
		return 12;
	}

	@Override
	public short violationCount() {
		System.out.println("running violationCount");
		return 5;
	}

	@Override
	public byte priority() {
		System.out.println("running priority");
		return 2;
	}

	@Override
	public String additionalInfo() {
		System.out.println("running additionalInfo");
		return null;
	}

	@Override
	public String lastUpdated() {
		System.out.println("running lastUpdated");
		return null;
	}

	@Override
	public String operationTime() {
		System.out.println("running operationTime");
		return null;
	}

	@Override
	public double thresholdAmount() {
		System.out.println("running thresholdAmount");
		return 200;
	}

	@Override
	public boolean active() {
		System.out.println("running active");
		return true;
	}

	@Override
	public String exceptions() {
		System.out.println("running exceptions");
		return null;
	}

	
	}

