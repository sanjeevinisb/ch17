package com.xworkz.datatype;

public class FootWear {
	public Shoe shoe;
	public void flat()
	{
		if(shoe!=null) {
			shoe.enhanceWalk();
		     shoe.safeGuard();
		     System.out.println(shoe.brand);
		     System.out.println(shoe.cost);
		    
		}
		else {
			System.out.println("shoe is null");
		}
	}
}
