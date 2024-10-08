package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeMinisterRunner1 {

	public static void main(String[] args) {
		  Collection<String> collection = new ArrayList<String>();
		  collection.add("Jawaharlal Nehru");
		  collection.add("Gulzarilal Nanda");     
		  collection.add("Lal Bahadur Shastri");
		  collection.add("Indira Gandhi ");
		  collection.add("Morarji Desai");
		  collection.add("Charan Singh");
		  collection.add("Rajiv Gandhi");
		  collection.add("Vishwanath Pratap Singh");
		  collection.add("Chandra Shekhar");
		  collection.add("Atal Bihari Vajpayee");
		  collection.add("H. D. Deve Gowda");
		  collection.add("Narendra Modi");
		  
		  
		  
		  collection.forEach(ref -> System.out.println(ref));
		  System.out.println("After Sorting.........");

		  collection.stream()
		      .sorted((ref1, ref2) -> ref1.compareTo(ref2)) // Sort in ascending order
		      .collect(Collectors.toList()) 
		      .forEach(ref -> System.out.println(ref));

		  
	}
	}


