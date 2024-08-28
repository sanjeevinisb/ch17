package com.xworkz.datatype;

public class Sandal {
	public void protect(Shoe shoe)
	{
		if(shoe!=null) {
			shoe.enhanceWalk();
			shoe.safeGuard();
     System.out.println(shoe.brand);
     System.out.println(shoe.cost);
}
		else {
			System.out.println("Shoe is null");
		}

}
}