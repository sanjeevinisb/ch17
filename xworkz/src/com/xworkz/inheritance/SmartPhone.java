package com.xworkz.inheritance;

	public class SmartPhone {

	   public String brand;
	   public String model;
	   public double price;
	   public int batteryCapacity;

	   public SmartPhone()
	   {
		   System.out.println("Created a SmartPhone using a no args cons....");
	   }
	   public SmartPhone(String brand, String model,double price,int batteryCapacity)
	   {
		   System.out.println("Created a SmartPhone using an args const..");
		   this.brand=brand;
		   this.model=model;
		   this.price=price;
		   this.batteryCapacity=batteryCapacity;
	   }
	   public void display()
	   {
		   System.out.println("Running display");

	   }
	   public void call()
	   {
		   System.out.println("Running call");

	   }

	}

