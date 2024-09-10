package com.xworkz.casting.runner;

import com.xworkz.casting.Bedsheet;

public class BedsheetRunner {

	 public static void main(String[] args) {
	        Bedsheet bedsheet1 = new Bedsheet("Cotton", "Red", "Floral", 2.0, 1.5, "ComfortBrand");
	        Bedsheet bedsheet2 = new Bedsheet("Cotton", "Blue", "Striped", 2.0, 1.5, "ComfortBrand");


	        bedsheet1.equals(bedsheet2);
	        boolean same =bedsheet1.equals(bedsheet2);
	        System.out.println("bedsheet1 is same as bedsheet2:"+same);
	    }
	

}
