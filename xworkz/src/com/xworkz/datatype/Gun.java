package com.xworkz.datatype;

public class Gun {
	private String name;
	private String countryMade;
	private String type;

	public Gun() {

		System.out.println("created gun using no arg constructor");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}

	public void fire() {
		System.out.println("running fire in Gun");

	}

	public void display() {
		System.out.println("running display in Gun");
		System.out.println("Name: " + this.name);
		System.out.println("Country Made : " + this.countryMade);
		System.out.println("Type: " + this.type);
	}
}