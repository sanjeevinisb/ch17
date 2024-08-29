package com.xworkz.datatype;

public class Doll {
	public void put(Cloth cloth) {
		if(cloth!=null) {
			System.out.println("running put in Doll");
			cloth.comfort();
			cloth.display();
		}

	}
}
