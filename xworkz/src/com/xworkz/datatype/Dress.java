package com.xworkz.datatype;

public class Dress {
	private Cloth cloth = new Cloth("Max", 700, "S");

	public void show() {
		if(cloth!=null) {
		System.out.println("running fold in cloth");
		cloth.comfort();
		cloth.display();
		}
		else {
			System.out.println("cloth is null");
		}
	}
}
