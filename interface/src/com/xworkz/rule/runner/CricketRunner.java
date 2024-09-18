package com.xworkz.rule.runner;

import com.xworkz.rule.internal.BCCI;
import com.xworkz.rule.implement.KACricketRule;
import com.xworkz.rule.internal.CricketRule;
class CricketRunner {

	public static void main(String[] args) {
	CricketRule cricketRule= new KACricketRule();
BCCI bcci = new BCCI();
bcci.setCricketRule(cricketRule);
bcci.check();
	}

}
