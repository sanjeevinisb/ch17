package com.xworkz.string.runner;

public class SocketRunner {

	public static void main(String[] args) {
	
		String ref = "Good Day";
		String ref1 = "Good Day";
		String ref2 = new String("Good Day");

		System.out.println(ref == ref1);         
		System.out.println(ref.equals(ref1));     

		System.out.println(ref == ref2);        
		System.out.println(ref.equals(ref2));   
	}
}
	
