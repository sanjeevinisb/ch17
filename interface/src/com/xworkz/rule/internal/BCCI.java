package com.xworkz.rule.internal;

public class BCCI {
private CricketRule cricketRule;
public void setCricketRule(CricketRule cricketRule) 
{
	this.cricketRule=cricketRule;
}
public void check() {
	System.out.println("running check in BCCI");
	if(cricketRule!=null) {
	System.out.println("cricketRule is not null");
	cricketRule.powerPlay();
}else {
	System.out.println("cricketRule is null");
}
	
	
}
}
