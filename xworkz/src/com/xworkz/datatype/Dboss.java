package com.xworkz.datatype;

public class Dboss {
	private Gun gun;

	public Dboss(Gun gun) {
		super();
		this.gun = gun;
	}

	public void shoot() {
		if (gun != null) {
			System.out.println("running shoot in dboss");
			gun.fire();
			gun.display();

		} 
		else 
		{
			System.out.println("gun is null");
		}
	}

}

