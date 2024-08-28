package com.xworkz.datatype;

public class Steel {
	public WaterBottle waterBottle;
	public void cup()
	{
		if(waterBottle!=null) {
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.quantity);
			System.out.println(waterBottle.color);
		    
		}
		else {
			System.out.println("waterBottle is null");
		}
	}
}

