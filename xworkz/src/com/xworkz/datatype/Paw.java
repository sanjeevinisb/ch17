package com.xworkz.datatype;

public class Paw {
	public Cat cat;
	public void feet()
	{
		if(cat!=null) {
			cat.pet();
			cat.eat();
			cat.sleep();
			System.out.println(cat.breed);
			System.out.println(cat.price);  
}
		
		else {
			System.out.println("cat is null");
		}
	}
}
