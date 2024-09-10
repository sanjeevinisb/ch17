package com.xworkz.casting;

public class Person {
	    private String name;
	    private int age;
	    private String gender;
	    private String address;
	    private String email;
	    private String phoneNumber;

	    public Person(String name, int age, String gender, String address, String email, String phoneNumber) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.address = address;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }


	    @Override
	    public String toString() {
	        return "Person{" + "name='" + name + '\'' + ", age=" + age +
", gender='" + gender + '\'' +", address='" + address + '\'' +", email='" + email + '\'' +
", phoneNumber='" + phoneNumber + '\'' +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Person");
	        if (obj != null )
	        	{
	        	if(obj instanceof Person)
	        	{ 
	        		Person casted = (Person) obj;
	        if(this.age==casted.age && this.name.equals(casted.name) && this.gender.equals(casted.gender)) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Person");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }


	   
}
