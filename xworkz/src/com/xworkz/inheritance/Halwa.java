package com.xworkz.inheritance;

public class Halwa {
	public String name;
	public int quantity;
	public double price;

	public Halwa()
	{
		System.out.println("Created a Halwa with no args cons..");
	}
	public Halwa(String name, int quantity,double price)
	{
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public void taste()
	{
		System.out.println("Running taste");
		
	}
	public void flavour()
	{
		System.out.println("Running flavour");

}
}
 


