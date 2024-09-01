package com.xworkz.superchaining;

public class Government {
	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinisterName;

	public Government(String state, int noOfMlas, String partyHeadName, String homeMinisterName) {
		super();
		this.state = state;
		this.noOfMlas = noOfMlas;
		this.partyHeadName = partyHeadName;
		this.homeMinisterName = homeMinisterName;
	}
	
	public Government(int noOfMlas, String partyHeadName) {
		super();
		this.noOfMlas = noOfMlas;
		this.partyHeadName = partyHeadName;
	}


	public Government(String state, String homeMinisterName) {
		super();
		this.state = state;
		this.homeMinisterName = homeMinisterName;
	}

	public void display() {
		   System.out.println("display Government");
			System.out.println("State :"+state);
			System.out.println("Number of MLAs :"+noOfMlas);
			System.out.println("Party Head Name :"+partyHeadName);
			System.out.println("Home Minister Name :"+homeMinisterName);
			
	
	}

}

