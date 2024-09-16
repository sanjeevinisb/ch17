package com.xworkz.rule.runner;

import com.xworkz.rule.implement.SaiTempleRule;
import com.xworkz.rule.internal.TempleRule;

public class TempleRuleRunner {

	public static void main(String[] args) {
		TempleRule temple = new SaiTempleRule();
		System.out.println(temple.offertory());
		System.out.println(temple.ruleDescription());
		System.out.println(temple.active());
		System.out.println(temple.donationAmount());
		System.out.println(temple.importanceLevel());
		System.out.println(temple.ruleCreationDate());
		System.out.println(temple.serviceFee());
		System.out.println(temple.restriction());
		System.out.println(temple.priorityLevel());
		System.out.println(temple.maxDonation());

		
	}

}
