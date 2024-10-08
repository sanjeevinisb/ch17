package com.xworkz.collection.runner;

import java.util.Iterator;
import java.util.LinkedList;
import com.xworkz.collection.constants.MatchBoxMaterial;
import com.xworkz.collection.dto.MatchBoxDTO;


public class MatchBoxRunner {

	public static void main(String[] args) {
MatchBoxDTO matchBoxDTO1= new MatchBoxDTO(15,"ABCD", MatchBoxMaterial.WOOD);
MatchBoxDTO matchBoxDTO2= new MatchBoxDTO(10,"EFGH", MatchBoxMaterial.PLASTIC);

LinkedList<MatchBoxDTO> collection=new LinkedList<MatchBoxDTO>();
collection.add(matchBoxDTO1);
collection.add(matchBoxDTO2);


System.out.println("Total element :"+collection.size());
System.out.println("isEmpty :"+collection.isEmpty());
collection.clear();
System.out.println("After Clear...");
System.out.println("isEmpty :"+collection.isEmpty());
System.out.println("Total element :"+collection.size());

	
Iterator<MatchBoxDTO> iterator=collection.iterator();
 
while(iterator.hasNext());
{
	System.out.println("element exist");
	MatchBoxDTO ref =iterator.next();
	System.out.println(ref);

	}

	
}
}
