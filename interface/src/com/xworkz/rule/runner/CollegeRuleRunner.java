package com.xworkz.rule.runner;

import com.xworkz.rule.implement.ManagementCollegeRule;
import com.xworkz.rule.internal.CollegeRule;

public class CollegeRuleRunner {
	
	public static void main(String[] args) {
		
	CollegeRule college=new ManagementCollegeRule();
	System.out.println(college.maxCreditsPerSemester());
	System.out.println(college.minimumGPARequired());
	System.out.println(college.ruleDescription());
	System.out.println(college.attendanceMandatory());
	System.out.println(college.gradeLetter());
	System.out.println(college.ruleId());
	System.out.println(college.maxClassHoursPerWeek());
	System.out.println(college.maximumAllowedAbsences());
	System.out.println(college.minimumAgeRequirement());
	System.out.println(college.approvedCourses());

}
	

}
