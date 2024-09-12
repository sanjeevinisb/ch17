package com.xworkz.polymorphism.runner;

import com.xworkz.polymorphism.runtime.Blanket;
import com.xworkz.polymorphism.runtime.Wool;
import com.xworkz.polymorphism.runtime.Cotton;

public class BlanketRunner {

	    public static void main(String[] args) {
	        Blanket blanket;

	        blanket = new Wool();
	        blanket.cover();  

	        blanket = new Cotton();
	        blanket.cover();  
	    }
	}



	
