package com.xworkz.rule.internal;

public class AsiaMallRule {
	private MallRule mallRule;
	public void setMallRule(MallRule mallRule) 
	{
		this.mallRule=mallRule;
	}
	public void show () {
		System.out.println("running check in AsiaMallRule");
		if(mallRule!=null) {
		System.out.println("mallRule is not null");
		mallRule.validId();
	}else {
		System.out.println("mallRule is null");
	}
}
}
