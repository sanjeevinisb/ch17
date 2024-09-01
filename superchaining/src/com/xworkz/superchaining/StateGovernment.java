package com.xworkz.superchaining;

	public class StateGovernment extends Government {

		public StateGovernment() {
			super("Karnataka",224,"Siddaramaiah","Gangadharaiah Parameshwara");
		}

		public StateGovernment(String state, String homeMinisterName) {
			super(state,homeMinisterName);
		}
		public StateGovernment(int noOfMlas, String partyHeadName) {
			super(noOfMlas,partyHeadName);
			System.out.println("Running StateGovernment in Government with noOfMlas and partyHeadName parameters");

	}

	}

