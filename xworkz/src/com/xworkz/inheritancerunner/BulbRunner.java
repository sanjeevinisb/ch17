package com.xworkz.inheritancerunner;
import com.xworkz.inheritance.Tubelight;
import com.xworkz.inheritance.Bulb;
public class BulbRunner {

	public static void main(String[] args) {
		Tubelight tubelight1=new Tubelight();
		tubelight1.wattage=60;
		tubelight1.glow();
		System.out.println(tubelight1.wattage);
		Bulb bulb1=new Tubelight();
		bulb1.wattage=45;
		bulb1.glow();
		System.out.println(bulb1.wattage);
				
		

	}

} 
