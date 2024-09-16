package com.xworkz.rule.internal;

public interface TrafficRule {
int ruleId();
String description();
double speedLimit();
boolean enforced();
float penaltyAmount();
String allowedVehicles();
String timeRestrictions();
int maxParkingDuration();
double locationCoordinates();
int numberOfViolations();
byte penaltyPoints();
String requiredDocuments();
String advisoryNotices();

}
