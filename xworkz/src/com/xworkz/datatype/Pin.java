package com.xworkz.datatype;

public class Pin {
	public void combine(Buckle buckle)
	{
		if(buckle!=null) {
			buckle.hold();
			buckle.tie();
     System.out.println(buckle.brand);
     System.out.println(buckle.cost);
}
		else {
			System.out.println("Buckle is null");
		}
	}
}
