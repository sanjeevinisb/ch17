package com.xworkz.external;

import com.xworkz.internal.Weapon;

public class MachineGun extends Weapon{
	@Override
	public void use()
	{
		System.out.println("Running  Use in MachineGun");
	}
	@Override
	public void fire()
	{
		System.out.println("Running fire in MachineGun");

	}

	public void grease()
	{
		System.out.println("Running a grease in MachineGun ");
		use();
		fire();
	}

}


