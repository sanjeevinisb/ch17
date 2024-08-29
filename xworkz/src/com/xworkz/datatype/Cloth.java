package com.xworkz.datatype;

public class Cloth {
	private String brand;
	private double price;
	private String size;

	public Cloth() {
		System.out.println("created Cloth constructor with no arg...");
	}

	public Cloth(String brand, double price, String size) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public void comfort() {
		System.out.println("running comfort in Cloth");
	}

	public void display() {
		System.out.println("Cloth brand: " + brand);
		System.out.println("Cloth price: " + price);
		System.out.println("Cloth size: " + size);
	}

}

