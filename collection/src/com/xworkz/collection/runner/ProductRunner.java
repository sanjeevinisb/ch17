package com.xworkz.collection.runner;

import java.util.ArrayList;  
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import com.xworkz.collection.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		Collection<ProductDTO> products = new ArrayList<ProductDTO>();
		products.add(new ProductDTO (1,"Mobile","Samsung",25000));
		products.add(new ProductDTO (2,"Laptop","Lenovo",28000));    
		products.add(new ProductDTO (3,"Chocolate","Alpenliebe",67000));
		products.add(new ProductDTO (4,"Watch","Noise",2000));
		products.add(new ProductDTO (5,"Shoes","Nike",22000));
		products.add(new ProductDTO (6,"Tv","Lg",34000));
		products.add(new ProductDTO (7,"Refrigerator","Whirlpool",17000));
		products.add(new ProductDTO (8,"Bag","Feather",1500));
		products.add(new ProductDTO (9,"Bottle","Borosil",5000));
		products.add(new ProductDTO (10,"Lunch Box","Milton",1400));
		
		
		products.forEach((productDTO)->System.out.println(productDTO));
		 // 1. Collect product cost greater than 5000
		System.out.println("********sort*********");
		 products
		 .stream()
         .filter(dto -> dto.getCost() > 5000)
         .collect(Collectors.toList())
         .forEach(dto -> System.out.println(dto));
		 
		// 2. Collect product cost greater than 5000 & less than 30000
		System.out.println("********sort*********");
		 products
		 .stream()
         .filter(dto -> dto.getCost() > 5000 && dto.getCost() < 30000) 
         .sorted((dto1, dto2) -> Double.compare(dto2.getCost(), dto1.getCost()))
         .collect(Collectors.toList())
         .forEach(dto -> System.out.println(dto));	
		 
		 // 3. Collect product sorted in descending order by cost
		 System.out.println("********sort*********");
	       products
	       .stream()
	       .sorted((dto1, dto2) -> Double.compare(dto2.getCost(), dto1.getCost()))
	       .collect(Collectors.toList())
	       .forEach(dto -> System.out.println(dto));	
		 
		 // 4. Collect products where vendor names start with 'A' and sort by name in ascending order
		 System.out.println("********sort*********");
		 products
		 .stream()
		 .filter(dto -> dto.getVendor().startsWith("A"))  
         .forEach(dto -> System.out.println(dto));
		 
		  // 5. Collect products sorted by cost & id
			System.out.println("********sort*********");
	       products
	       .stream()
	      .sorted(Comparator.comparingDouble(ProductDTO::getCost).thenComparingInt(ProductDTO::getId))
	      .collect(Collectors.toList())
	      .forEach(dto -> System.out.println(dto));	
	       
	    // 6. Collect only names from products
			System.out.println("********sort*********");
	        products
	        .stream()
	        .map((dto) ->dto.getName())
	        .collect(Collectors.toList())
	        .forEach(dto -> System.out.println(dto));	
	        
	     // 7. Collect only ids from products
			System.out.println("********sort*********");
	      products
	      .stream()
	      .map((dto) ->dto.getId())	      
	      .collect(Collectors.toList())
	      .forEach(dto -> System.out.println(dto));
	      
	   // 8. Collect product by converting name to uppercase
			System.out.println("********sort*********");
	        products
	        .stream()
	        .map((dto)-> dto.getName().toUpperCase())
	        .collect(Collectors.toList())
	        .forEach(dto -> System.out.println(dto));
	 
			 
	}

}
