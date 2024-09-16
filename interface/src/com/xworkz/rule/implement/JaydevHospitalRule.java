package com.xworkz.rule.implement;
import com.xworkz.rule.internal.HospitalRule;

public class JaydevHospitalRule implements HospitalRule {

@Override
public boolean maintainSilence() {
	System.out.println("running maintainSilence in JaydevHospitalRule");
	return true;
}

@Override
public int vistorAllowed() {
	System.out.println("running vistorAllowed in JaydevHospitalRule");
	return 8;
}

@Override
public boolean critical() {
	System.out.println("running critical in JaydevHospitalRule");
	return false;
}
}

