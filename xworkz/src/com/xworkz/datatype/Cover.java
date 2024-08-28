package com.xworkz.datatype;

public class Cover {
	public Hat hat;
	public void fold()
	{
		if(hat!=null) {
		     hat.shade();
		     System.out.println(hat.color);
		}
		else {
			System.out.println("hat is null");
		}
	}

}
