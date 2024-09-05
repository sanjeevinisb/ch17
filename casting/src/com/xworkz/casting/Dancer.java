package com.xworkz.casting;

public class Dancer {
public void use(Belt belt)
{
	System.out.println("running use in Dancer");
	belt.tie();
	if(belt instanceof LeatherBelt) {
		System.out.println("instance is of LeatherBelt");
		LeatherBelt leatherBelt=(LeatherBelt)belt;
		leatherBelt.clip();
		
	}
}
}
