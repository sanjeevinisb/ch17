package com.xworkz.datatype;

public class Police {
	public void security(Gun gun) {
		if (gun != null) {
			System.out.println("running security in police");
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("gun is null");
		}
	}

}

