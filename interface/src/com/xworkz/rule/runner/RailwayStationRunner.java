package com.xworkz.rule.runner;

import com.xworkz.rule.implement.VandeBharatRule;
import com.xworkz.rule.internal.RailwayStationRule;

public class RailwayStationRunner {

	public static void main(String[] args) {
		RailwayStationRule railway = new VandeBharatRule();
		System.out.println(railway.ruleDescription());
		System.out.println(railway.mandatory());
		System.out.println(railway.ruleId());
		System.out.println(railway.fineAmount());
		System.out.println(railway.severityLevel());
		System.out.println(railway.ruleEffectiveDate());
		System.out.println(railway.complianceRate());
		System.out.println(railway.priority());
		System.out.println(railway.violationCount());
		System.out.println(railway.operationTime());
		System.out.println(railway.active());
	}
		
	}




