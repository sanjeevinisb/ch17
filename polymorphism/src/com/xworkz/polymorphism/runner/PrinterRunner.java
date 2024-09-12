package com.xworkz.polymorphism.runner;

import com.xworkz.polymorphism.compiletime.Printer;

public class PrinterRunner {

	    public static void main(String[] args) {
	        Printer printer = new Printer();
	       
	        printer.print(10);          
	        printer.print(10.5);       
	        printer.print("Hello");   
	    }
	}


	
