package com.xworkz.datatype;

public class Solider {
	public void protect() {
		System.out.println("running protect in solider");
		Gun gun=new Gun("Mosin-Nagant","rifle","Russian Empire");
		gun.fire();
		gun.display();
		
	}

}
