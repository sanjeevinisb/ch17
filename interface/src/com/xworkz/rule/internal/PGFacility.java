package com.xworkz.rule.internal;

public class PGFacility {
	private PGRule pgRule;

	public void setPGRule(PGRule pgRule){
		this.pgRule=pgRule;
	}

	public void security() {
		System.out.println("running security in PGFacility");
		if (pgRule != null) {
			System.out.println("PGRule is not null");
			pgRule.costPermonth();
			pgRule.wifi();
		} else {
			System.out.println("PGRule is null");
		}

}
}
