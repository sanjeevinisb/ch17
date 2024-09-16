package com.xworkz.rule.internal;

public interface CollegeRule {
     int maxCreditsPerSemester();            
     double minimumGPARequired();            
     String ruleDescription();               
     boolean attendanceMandatory();         
     char gradeLetter();                     
     long ruleId();                          
     float maxClassHoursPerWeek();           
     short maximumAllowedAbsences();         
     byte minimumAgeRequirement();           
     String approvedCourses();         
}
