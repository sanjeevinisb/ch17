package com.xworkz.rule.runner;

import com.xworkz.rule.internal.HospitalRule;
import com.xworkz.rule.implement.JaydevHospitalRule;

public class HospitalRuleRunner {

	public static void main(String[] args) {
		HospitalRule hospital=new JaydevHospitalRule();
		System.out.println(hospital.maintainSilence());
		System.out.println(hospital.vistorAllowed());
		System.out.println(hospital.critical());
		
	}

}


