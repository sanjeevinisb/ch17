package com.xworkz.inheritance;

public class Chicken {
	public String species;
	public double wingspan;
	public String gender;
	public int eggCount;
	public String habitat;
	public String breed;
	public int weight;
	public String sound;
	public String quality;
	public String color;

public 	Chicken()
{
	System.out.println("Created a with no args const..");
}


public Chicken(String species, double wingspan, String gender, int eggCount, String habitat, String breed, int weight,
		String sound, String quality, String color) {
	super();
	this.species = species;
	this.wingspan = wingspan;
	this.gender = gender;
	this.eggCount = eggCount;
	this.habitat = habitat;
	this.breed = breed;
	this.weight = weight;
	this.sound = sound;
	this.quality = quality;
	this.color = color;
}
public void chirp()
{
	System.out.println("Running chirp");
	
}
public void fly()
{
	System.out.println("Running fly");
}
public void eat()
{
	System.out.println("Running eat");
}
public void sleep()
{
	System.out.println("Running sleep");
}
public void migrate()
{
	System.out.println("Running migrate");
}
}



