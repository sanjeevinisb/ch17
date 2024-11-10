package com.xworkz.string.runner;

public class StringRunner {

		public static void main(String[] args) {

			String value="Sanjeevini";
			String value1="Sanjeevini";

			if(value==value1)
			{
				System.out.println("both are same");
			}
			else {
				System.out.println("both are different");
			}

			String value2=new String("Laptop");
			String value3=new String("Laptop");

			if(value2==value3)
			{
				System.out.println("both are same");
			}
			else {
				System.out.println("both are different"); 
			}
			

			if(value2.equals(value3))
			{
				System.out.println("both are same");
			}
			else {
				System.out.println("both are different");
			}
			
			System.out.println(value.toCharArray());
			System.out.println(value.startsWith("Sa"));
			System.out.println(value.toString());
			System.out.println(value.toUpperCase());
			System.out.println(value.toLowerCase());
			System.out.println(value.substring(2,5));
			System.out.println(value.substring(3));
			System.out.println(value1);
			System.out.println(value1.trim());
			System.out.println(value2.charAt(2));
			System.out.println(value2.isEmpty());
			System.out.println(value2.concat("Dell"));
			System.out.println(value2.contains("t"));
			System.out.println(value2.endsWith("p"));
			System.out.println(value2.equals(value3));
			System.out.println(value2.indexOf('a'));
			System.out.println(value2.indexOf("Lap"));
			System.out.println(value2.indexOf("a", 1));
			

	}
}