package com.xworkz.datatype;

public class Fan {
	public void tear(Hat hat)
	{
		if(hat!=null) {
     hat.shade();
     System.out.println(hat.color);
}
		else {
			System.out.println("Hat is null");
		}
	}
}
