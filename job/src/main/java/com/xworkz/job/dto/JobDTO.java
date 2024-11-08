package com.xworkz.job.dto;


public class JobDTO {
private String name;
private String email;
private String qualification;
private String yop;
private double salaryExpectation;

public JobDTO() {
	
}


public JobDTO(String name, String email, String qualification, String yop, double salaryExpectation) {
	super();
	this.name = name;
	this.email = email;
	this.qualification = qualification;
	this.yop = yop;
	this.salaryExpectation = salaryExpectation;
}


@Override
public String toString() {
	return "JobDTO [name=" + name + ", email=" + email + ", qualification=" + qualification + ", yop=" + yop
			+ ", salaryExpectation=" + salaryExpectation + "]";
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getQualification() {
	return qualification;
}


public void setQualification(String qualification) {
	this.qualification = qualification;
}


public String getYop() {
	return yop;
}


public void setYop(String yop) {
	this.yop = yop;
}


public double getSalaryExpectation() {
	return salaryExpectation;
}


public void setSalaryExpectation(double salaryExpectation) {
	this.salaryExpectation = salaryExpectation;
}
}


