package com.xworkz.datatype;

public class Fabric {
	public Cloth material() {
		Cloth cloth=new Cloth("Allen Solly", 20000, "XL");
		cloth.comfort();
		cloth.display();
		return cloth;
	}
}
