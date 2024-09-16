package com.xworkz.rule.internal;

public interface RailwayStationRule {
	 String ruleDescription();    
     int ruleId();                
     boolean mandatory();       
     double fineAmount();          
     char severityLevel();        
     long ruleEffectiveDate();    
     float complianceRate();      
     short violationCount();      
     byte priority();              
     String additionalInfo();     
     String lastUpdated();
     String operationTime(); 
     double thresholdAmount();
     boolean active();           
     String exceptions(); 

}
