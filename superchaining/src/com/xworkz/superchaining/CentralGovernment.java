package com.xworkz.superchaining;

public class CentralGovernment extends Government {

	public CentralGovernment() {
		super("Maharashtra",288,"Eknath Shinde","Devendra Fadnavis");
	}

	public CentralGovernment(String state, String homeMinisterName) {
		super(state,homeMinisterName);
	}
	public CentralGovernment(int noOfMlas, String partyHeadName) {
		super(noOfMlas,partyHeadName);
		System.out.println("Running CentralGovernment in Government with noOfMlas and partyHeadName parameters");

}
}

