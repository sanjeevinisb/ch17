package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StatesRunner {

	public static void main(String[] args) {
		 Collection<String> collection = new ArrayList<String>();
		  collection.add("Himachal Pradesh");
		  collection.add("Chhattisgarh");     
		  collection.add("Assam");
		  collection.add("Haryana");
		  collection.add("Andhra Pradesh");
		  collection.add("Arunachal Pradesh");
		  collection.add("Bihar");
		  collection.add("Goa");
		  collection.add("Madhya Pradesh");
		  collection.add("Karnataka");
		  collection.add("Kerala");
		  collection.add("Maharashtra");
		  collection.add("Manipur");
		  collection.add("Jharkhand");     
		  collection.add("Meghalaya");
		  collection.add("Nagaland");
		  collection.add("Punjab");
		  collection.add("Mizoram");
		  collection.add("Odisha");
		  collection.add("Rajasthan");
		  collection.add("Tamil Nadu");
		  collection.add("Sikkim");
		  collection.add("Telangana");
		  collection.add("West Bengal");
		  collection.add("Uttarakhand");
		  collection.add("Uttar Pradesh");
		  
		  
		  
		  collection.forEach(ref -> System.out.println(ref));
		  System.out.println("After Sorting.........");

		  collection.stream()
		      .sorted((ref1, ref2) -> ref2.compareTo(ref1)) // Sort in descending order
		      .collect(Collectors.toList()) 
		      .forEach(ref -> System.out.println(ref));

	}

}
