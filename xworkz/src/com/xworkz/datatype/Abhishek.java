package com.xworkz.datatype;

public class Abhishek {
	private WashingMachine washingMachine;

	public Abhishek(WashingMachine washingMachine) {
		super();
		this.washingMachine = washingMachine;
	}

	public void dry() {
		if (washingMachine != null) {
			System.out.println("running dry in Abhishek");
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("washing machine is null");
		}
	}

}

