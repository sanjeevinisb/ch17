package com.xworkz.rule.runner;

import com.xworkz.rule.implement.PGManagementRule;
import com.xworkz.rule.internal.PGFacility;
import com.xworkz.rule.internal.PGRule;

public class PGRunner {

	public static void main(String[] args) {
		PGRule pgRule= new PGManagementRule();
		PGFacility pgFacility = new PGFacility();
		pgFacility.setPGRule(pgRule);
		pgFacility.security();
		System.out.println(pgRule.costPermonth());
		System.out.println(pgRule.wifi());
		

	}

}
