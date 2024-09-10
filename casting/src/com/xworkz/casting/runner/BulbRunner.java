package com.xworkz.casting.runner;

import com.xworkz.casting.Bulb;

public class BulbRunner {

	 public static void main(String[] args) {
	        Bulb bulb1 = new Bulb("Incandescent", 60, "Warm White", "A19", false, 2.99);
	        Bulb bulb2 = new Bulb("Incandescent", 60, "Warm White", "A19", false, 2.99);

	        bulb1.equals(bulb2);
	        boolean same =bulb1.equals(bulb2);
	        System.out.println("bulb1 is same as bulb2:"+same);

	}
	}


