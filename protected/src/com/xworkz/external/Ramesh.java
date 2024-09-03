package com.xworkz.external;

import com.xworkz.internal.Gun;
import com.xworkz.internal.Weapon;


public class Ramesh {
	Weapon weapon=new Weapon();
	Gun gun=new Gun();

	public void display()
	{
		weapon.use();
		weapon.fire();

	}

	public void load()
	{
		gun.use();
		gun.fire();
		gun.trigger();

	}


}


