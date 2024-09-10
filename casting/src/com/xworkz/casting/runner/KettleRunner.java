package com.xworkz.casting.runner;

import com.xworkz.casting.Kettle;

public class KettleRunner {

	public static void main(String[] args) {
		
		        Kettle kettle1 = new Kettle("Prestige", 1.9, "Red", true, 1800, "Stainless Steel");
		        Kettle kettle2 = new Kettle("Borosil", 1.9, "Blue", true, 1800, "Stainless Steel");

		        kettle1.equals(kettle2);
		        boolean same =kettle1.equals(kettle2);
		        System.out.println("kettle1 is same as kettle2:"+same);
		        
	}

}
