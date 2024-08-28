package com.xworkz.datatype;

public class Domestic {
	public void care(Cat cat)
	{
		if(cat!=null) {
			cat.pet();
			cat.eat();
			cat.sleep();
			System.out.println(cat.breed);
			System.out.println(cat.price);  
}
		else {
			System.out.println("Cat is null");
		}
}
}
