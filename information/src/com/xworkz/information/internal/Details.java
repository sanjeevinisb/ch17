package com.xworkz.information.internal;

public class Details {


		private Person[] arr = new Person[5];
		private int index = 0; 
		public void store(Person d) {
			if(index < arr.length) {
				arr[index] = d;
				index++;
			}
			else {
				System.out.println("Array index out of range");
				System.out.println("-----------------------------------------");
			}
		}


		public void display()
		{
			for(Person del: arr) {
				if(del != null) {
					del.toString();
					System.out.println("-----------------------------------------");
				}
			}
		}
}
		
		
		


