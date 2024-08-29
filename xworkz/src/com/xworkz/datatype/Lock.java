package com.xworkz.datatype;

public class Lock {
	public Buckle buckle;
	public void connect()
	{
		if(buckle!=null) {
			buckle.tie();
		     buckle.hold();
		     System.out.println(buckle.brand);
		     System.out.println(buckle.cost);
		    
		}
		else {
			System.out.println("Buckle is null");
		}
}
}
