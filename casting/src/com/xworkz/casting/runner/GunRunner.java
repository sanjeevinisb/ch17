package com.xworkz.casting.runner;

import com.xworkz.casting.Gun;

public class GunRunner {

		public static void main(String[] args) {
	        Gun gun1 = new Gun("Smith & Wesson", "M&P Shield", 9, 7, 0.8, true);
	        Gun gun2 = new Gun("Smith & Wesson", "M&P Shield", 9, 7, 0.8, true);

	        gun1.equals(gun2);
	        boolean same =gun1.equals(gun2);
	        System.out.println("gun1 is same as gun2:"+same);

	}

}
