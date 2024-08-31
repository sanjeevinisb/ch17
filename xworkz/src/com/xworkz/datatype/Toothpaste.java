package com.xworkz.datatype;

public class Toothpaste {
 private String company;
 private boolean salt;
 
 public Toothpaste(String company,boolean salt)  {
	 super();
 this.company=company;
 this.salt=salt;
 System.out.println("running string,boolean const in Toothpaste");
}
 public Toothpaste(String company) {
	 this.company=company;
	 System.out.println("running string const in Toothpaste");
 }
 public void display() {
	 System.out.println("display Toothpaste");
	 System.out.println("company:"+company);
	 System.out.println("salt:"+salt);
	 
 }
}
