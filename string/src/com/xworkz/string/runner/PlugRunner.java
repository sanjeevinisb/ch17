package com.xworkz.string.runner;

public class PlugRunner {
	public static void main(String[] args) {
		
		String value="Charger"; //constant pool
		
		String value1=new String("Charger"); //instance memory
		
		
		if(value==value1)
		{
			System.out.println("both are same location");
		}
		else {
			System.out.println("both are different location");
		}
		
		
	}
}
