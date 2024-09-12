package com.xworkz.objectblock;

public class Bag {
	//example of classBlock
	
		String name;
		int price;

		{
			name = "Feather";
			price = 1500;
			System.out.println("Name " + name);
			System.out.println("Price " + price);
		}
		//constructor
		public Bag() {
			System.out.println("Creating a Bag with No-Agrs");
		}

		public static void main(String[] main)
		{
			System.out.println("Running in main");
			System.out.println("--------------");
			Bag bag= new Bag();
			System.out.println("--------------");
			Bag bag2= new Bag();
		}

	}

