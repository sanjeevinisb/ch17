package com.xworkz.superchainingrunner;
import com.xworkz.superchaining.CentralGovernment;
import com.xworkz.superchaining.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {

		StateGovernment stateGovernment = new StateGovernment();
		stateGovernment.display();

		StateGovernment stateGovernment1 = new StateGovernment("Uttar Pradesh","Yogi Adityanath");
		stateGovernment1.display();

		StateGovernment stateGovernment2 = new StateGovernment(222,"Pavan Kalyan");
		stateGovernment2.display();

		CentralGovernment centralGovernment = new CentralGovernment();
		centralGovernment.display();

		CentralGovernment centralGovernment1 = new CentralGovernment("Tamil Nadu","M K Stalin");
		centralGovernment1.display();
		
		CentralGovernment centralGovernment2 = new CentralGovernment(230,"Arvind Kejriwal");
		centralGovernment2.display();

	}

}

	
