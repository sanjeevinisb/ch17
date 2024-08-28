package com.xworkz.datatype;

public class Shoe {
	public String brand="Nike";
	public double cost=450;
	
	public Shoe() {
		System.out.println("created Shoe using no-arg const..");	
	}
	public void safeGuard() {
		System.out.println("running safeGuard in Shoe");
	}
	public void enhanceWalk()
    {
    	System.out.println("Running enhanceWalk in shoe");
    }
}


