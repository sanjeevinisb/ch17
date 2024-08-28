package com.xworkz.inheritance;

	public class Bull {
		public String name;
		public double weight;
		public boolean domestic;
		public int age;
		public String color;

	public 	Bull()
	{
		System.out.println("Created a with no args const..");
	}

	public Bull(String name, double weight, boolean domestic,int age, String color) {
		super();
		System.out.println("Created a with arg const..");
		this.name = name;
		this.weight = weight;
		this.domestic = domestic;
		this.age = age;
		this.color = color;
	}
	public void eat()
	{
		System.out.println("Running eat");
		
	}
	public void sleep()
	{
		System.out.println("Running sleep");
	}
	public void makeSound()
	{
		System.out.println("Running makeSound");
	}
	public void move()
	{
		System.out.println("Running move");
	}
	public void graze()
	{
		System.out.println("Running graze");
	}
	}