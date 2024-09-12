package com.xworkz.chaining.internal;

public class Vivo {

		private String model;
		private double price;

		public Vivo(String model, double price)
		{
			this.model=model;
			this.price=price;
			System.out.println("Running String,double in Vivo");
		}

		public void display() {
			System.out.println(" display in Vivo");
			System.out.println(this.model);
			System.out.println(this.price);
		}
	}

