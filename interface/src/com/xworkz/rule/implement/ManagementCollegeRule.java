package com.xworkz.rule.implement;

import com.xworkz.rule.internal.CollegeRule;

public class ManagementCollegeRule implements CollegeRule {
	

	@Override
	public int maxCreditsPerSemester() {
		System.out.println("running maxCreditsPerSemester");
		return 89;
	}

	@Override
	public double minimumGPARequired() {
		System.out.println("running minimumGPARequired");
		return 35;
	}

	@Override
	public String ruleDescription() {
		System.out.println("running ruleDescription");
		return null;
	}

	@Override
	public boolean attendanceMandatory() {
		System.out.println("running attendanceMandatory");
		return true;
	}

	@Override
	public char gradeLetter() {
		System.out.println("running gradeLetter");
		return 'P';
	}

	@Override
	public long ruleId() {
		System.out.println("running ruleId");
		return 385764L;
	}

	@Override
	public float maxClassHoursPerWeek() {
		System.out.println("running maxClassHoursPerWeek");
		return 19.3f;
	}

	@Override
	public short maximumAllowedAbsences() {
		System.out.println("running maximumAllowedAbsences");
		return 75;
	}

	@Override
	public byte minimumAgeRequirement() {
		System.out.println("running minimumAgeRequirement");
		return 20;
	}

	@Override
	public String approvedCourses() {
		System.out.println("running approvedCourses");
		return "BE";
	}

	
}
