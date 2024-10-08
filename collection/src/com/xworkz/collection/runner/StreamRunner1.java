package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRunner1 {
	public static void main(String[] args) {
		  Collection<Long> collection = new ArrayList<Long>();
		  collection.add(9903565721L);
		  collection.add(9452416780L);
		  collection.add(9567384219L);
		  collection.add(8036723459L);
		  collection.add(7796432145L);
		  collection.add(8673921789L);
		  collection.add(9483996412L);
		  collection.add(7411119854L);
		  collection.add(8096543218L);
		  collection.add(9902789327L);
		  
		  collection.forEach(ref -> System.out.println(ref));
		  System.out.println("After Sorting........");

		  collection.stream()
		      .sorted((ref1, ref2) -> Long.compare(ref1, ref2)) // Sort in ascending order
		      .collect(Collectors.toList()) 
		      .forEach(ref -> System.out.println(ref));

		  }
		}


