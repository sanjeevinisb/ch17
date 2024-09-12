package com.xworkz.information.internal;


	public class Person {

		private String name;
		private String email;
		private int age;
		private long mobileNo;
		
		public Person(String name, String email, int age, long mobileNo) {
			super();             
			this.name = name;
			this.email = email;
			this.age = age;
			this.mobileNo = mobileNo;
		}

		@Override
		public String toString() {
			System.out.println("The name: "+name);
			System.out.println("The email: "+email);
			System.out.println("The age: "+age);
			System.out.println("The mobileNo: "+mobileNo);
			return null;
			
		}
	}	



