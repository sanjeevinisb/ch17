package com.xworkz.datatype;

public class Cat {
	public String breed="Ragdoll";
	public double price=35000;
	
	public Cat() {
		System.out.println("created Cat using no-arg const..");	
	}
	public void pet() {
		System.out.println("running pet in Cat");
	}
	public void eat()
    {
    	System.out.println("Running eat in Cat");
    }
	public void sleep()
    {
    	System.out.println("Running sleep in Cat");
    }
}




