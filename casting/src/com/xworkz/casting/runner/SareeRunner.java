package com.xworkz.casting.runner;

import com.xworkz.casting.Saree;

public class SareeRunner {

		  public static void main(String[] args) {
		        Saree saree1 = new Saree("Silk", "Red", "Bandhani", 6.0, 1.2, "SareeBrand");
		        Saree saree2 = new Saree("Silk", "Red", "Floral", 6.0, 1.2, "SareeBrand");

		        saree1.equals(saree2);
		        boolean same =saree1.equals(saree2);
		        System.out.println("saree1 is same as saree2:"+same);
	}

}
