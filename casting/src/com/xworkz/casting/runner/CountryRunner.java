package com.xworkz.casting.runner;

import com.xworkz.casting.Country;

public class CountryRunner {
	 public static void main(String[] args) {
	        Country country1 = new Country("France", "Paris", 67000000, 551695, "French", "Euro");
	        Country country2 = new Country("France", "Paris", 67000000, 551695, "French", "Euro");
	        country1.equals(country2);
	        boolean same =country1.equals(country2);
	        System.out.println("country1 is same as country2:"+same);
}
}
