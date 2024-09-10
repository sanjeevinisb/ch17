package com.xworkz.casting.runner;

import com.xworkz.casting.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		  
		        Grinder grinder1 = new Grinder("Breville", "Barista Express", 8, 0.5, true, 699.99);
		        Grinder grinder2 = new Grinder("Breville", "Barista Express", 8, 0.5, true, 699.99);
		       

		        grinder1.equals(grinder2);
		        boolean same =grinder1.equals(grinder2);
		        System.out.println("grinder1 is same as grinder2:"+same);
		        
		    }

	}


