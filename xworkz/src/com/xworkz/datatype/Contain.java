package com.xworkz.datatype;

public class Contain {
	public void vessel() {
		WaterBottle waterBottle=new WaterBottle();
		waterBottle.fill();
		waterBottle.empty();
		waterBottle.crush();
		System.out.println(waterBottle.quantity);
		System.out.println(waterBottle.color);
 
	}

}
