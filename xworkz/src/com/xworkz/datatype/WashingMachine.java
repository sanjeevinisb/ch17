package com.xworkz.datatype;

public class WashingMachine {

	private String brand;
	private String type;
	private int capacity;

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public void rinse() {
		System.out.println("running rinse in washing machine..");

	}

	public void show() {
		System.out.println("washing machine brand: " + this.brand);
		System.out.println("washing machine type: " + this.type);
		System.out.println("washing machine capacity: " + this.capacity);

	}

}

