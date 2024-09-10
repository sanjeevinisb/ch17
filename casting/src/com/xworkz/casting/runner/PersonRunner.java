package com.xworkz.casting.runner;

import com.xworkz.casting.Person;

public class PersonRunner {

	 public static void main(String[] args) {
	        Person person1 = new Person("Alice", 30, "Female", "123 Street", "alice@example.com", "123-456-7890");
	        Person person2 = new Person("Alice", 30, "Female", "456 Avenue", "alice@example.com", "987-654-3210");

	        person1.equals(person2);
	        boolean same =person1.equals(person2);
	        System.out.println("person1 is same as person2:"+same);

	}

}
