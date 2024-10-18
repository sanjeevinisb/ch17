package com.xworkz.collection.runner;


	import java.util.ArrayList;
    import java.util.Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;
import com.xworkz.collection.constants.Location;
import com.xworkz.collection.dto.MallDTO;

	public class MallRunner {
	    public static void main(String[] args) {
	        Collection<MallDTO> mall = new ArrayList<MallDTO>();
	           mall.add(new MallDTO(5, "Orion Mall", Location.NORTH, "Owner1", 90000));
	           mall.add(new MallDTO(1, "GT Mall", Location.SOUTH, "Owner2", 120000));
	           mall.add(new MallDTO(8, "Nexus Mall", Location.WEST, "Owner3", 85000));
	           mall.add(new MallDTO(10,"Gopalan Mall", Location.EAST, "Owner4", 150000));
	           mall.add(new MallDTO(3, "Meenakshi Mall", Location.NORTH, "Owner5", 95000));
	           mall.add(new MallDTO(6, "Lulu Mall", Location.SOUTH, "Owner6", 100000));
	           mall.add(new MallDTO(2, "Mall Of Asia", Location.WEST, "Owner7", 115000));
	           mall.add(new MallDTO(4, "Mantri Square Mall", Location.EAST, "Owner8", 110000));
	           mall.add(new MallDTO(9, "Vega City Mall", Location.NORTH, "Owner9", 95000));
	           mall.add(new MallDTO(7, "Forum Mall", Location.SOUTH, "Owner10", 140000));
	        
	           mall.forEach((mallDTO)->System.out.println(mallDTO));

	           
	        // 1. Sort all malls by ID desc
	           System.out.println("********sort*********");
		       mall
		       .stream()
		       .sorted((dto1, dto2) -> Double.compare(dto2.getId(), dto1.getId()))
		       .collect(Collectors.toList())
		       .forEach(dto -> System.out.println(dto));	

		       
	        // 2. Sort all malls by name desc order
		       System.out.println("********sort*********");
		       mall
		       .stream()
		       .sorted((dto1, dto2) -> dto2.compareTo(dto1))
		       .collect(Collectors.toList())
		       .forEach(dto -> System.out.println(dto));	
			 
		       
	        // 3. Difference between Iterator and ListIterator
		    System.out.println("********sort*********");
	        System.out.println("Using Iterator to traverse:");
	        Iterator<MallDTO> iterator = mall.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        

	        System.out.println("Using ListIterator to traverse in reverse:");
	        ListIterator<MallDTO> listIterator = ((ArrayList<MallDTO>) mall).listIterator(mall.size());
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }

	        
	        // 4. Filter malls by landDimension less than one lakh
	        System.out.println("*****************");
	        Collection<MallDTO> landDimension = mall.stream()
	            .filter(dto -> dto.getLandDimension() < 100000)
	            .collect(Collectors.toList());
	        System.out.println("Malls with landDimension less than 1 lakh: " + landDimension);

	        
	        // 5. Collect only the names of the malls
	        System.out.println("********sort*********");
	        mall
	        .stream()
	        .map((dto) ->dto.getName())
	        .collect(Collectors.toList())
	        .forEach(dto -> System.out.println(dto));	

	        
	        // 6. Collect only landDimension and sort it in ascending order
	        System.out.println("*****************");
	        Collection<Double> landDimensions = mall
	        	.stream()
	            .map(MallDTO::getLandDimension)
	            .sorted()
	            .collect(Collectors.toList());
	        System.out.println("Land Dimensions sorted in Ascending Order: " + landDimensions);
	    }
	}

	
