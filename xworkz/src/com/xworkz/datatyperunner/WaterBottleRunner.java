package com.xworkz.datatyperunner;
import com.xworkz.datatype.Contain;
import com.xworkz.datatype.Plastic;
import com.xworkz.datatype.Steel;
import com.xworkz.datatype.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		Contain contain =new Contain();
		contain.vessel();
		
		Plastic plastic=new Plastic();
		WaterBottle waterBottle1=new WaterBottle();
		plastic.carry(waterBottle1);
		
		Steel steel=new Steel();
		WaterBottle waterBottle2=new WaterBottle();
        steel. waterBottle= waterBottle2;
        steel.cup();//instance 

	}

}
