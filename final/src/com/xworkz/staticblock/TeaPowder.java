package com.xworkz.staticblock;

	//A static block is used for static initialization of a class
	public class TeaPowder {
		// Static variable
		static String brand;
		// Static block
		static {
			brand = "Lipton";
			System.out.println("Static brand=" + brand);
		}

		public static void main(String[] args) {

			System.out.println("running in main");
			System.out.println("Static Variable :" + brand);
		}

	}

