package com.xworkz.rule.implement;

import com.xworkz.rule.internal.PGRule;

public class PGManagementRule implements PGRule{

	@Override
	public double costPermonth() {
		System.out.println("implementation of costPermonth in PGManagementRule");
		return 5500;
	}

	@Override
	public boolean wifi() {
		System.out.println("implementation of wifi in PGManagementRule");
		return true;
	}

}
