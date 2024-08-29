package com.xworkz.datatype;

public class Lakshmi {
	public void spin(WashingMachine washingMachine) {
		if (washingMachine != null) {
			System.out.println("running spin in Lakshmi");
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("wahing machine is null");
		}
	}
}
