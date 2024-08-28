package com.xworkz.datatype;

public class Plastic {
	public void carry(WaterBottle waterBottle)
	{
		if(waterBottle!=null) {
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.quantity);
			System.out.println(waterBottle.color);
}
		else {
			System.out.println("WaterBottle is null");
		}

}
}
