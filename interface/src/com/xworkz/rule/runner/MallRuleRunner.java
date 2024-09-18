package com.xworkz.rule.runner;

import com.xworkz.rule.implement.MallManagementRule;
import com.xworkz.rule.internal.AsiaMallRule;
import com.xworkz.rule.internal.MallRule;

public class MallRuleRunner {

	public static void main(String[] args) {
		MallRule mallRule= new MallManagementRule();
		AsiaMallRule asiaMallRule = new AsiaMallRule();
		asiaMallRule.setMallRule(mallRule);
		asiaMallRule.show();
		System.out.println(mallRule.validId());

	}

}
