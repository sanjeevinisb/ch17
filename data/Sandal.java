package com.xworkz.data;

public class Sandal {
		
		String brand;
		char size;
		double cost;
		String color;
		public Sandal(String brand, char size, double cost, String color) {
			super();
			this.brand = brand;
			this.size = size;
			this.cost = cost;
			this.color = color;
		}
		public void display()
		{
			System.out.println("Brand is:"+this.brand);
			System.out.println("Size is:"+this.size);
			System.out.println("Cost is:"+this.cost);
			System.out.println("Color is:"+this.color);
		}
		

	}



