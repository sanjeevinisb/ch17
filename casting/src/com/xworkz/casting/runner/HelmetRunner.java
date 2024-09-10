package com.xworkz.casting.runner;

import com.xworkz.casting.Helmet;

public class HelmetRunner {

	  public static void main(String[] args) {
	        Helmet helmet1 = new Helmet("BrandA", "ModelX", "Red", 58, 1.2, true);
	        Helmet helmet2 = new Helmet("BrandA", "ModelX", "Blue", 58, 1.2, true);
	        
	        helmet1.equals(helmet2);
	        boolean same =helmet1.equals(helmet2);
	        System.out.println("helmet1 is same as helmet2:"+same);

	}

}
