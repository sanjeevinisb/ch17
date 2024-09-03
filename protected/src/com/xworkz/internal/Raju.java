package com.xworkz.internal;


	public class Raju {

		Weapon weapon=new Weapon();
		Gun gun =new Gun();

		public void shoot()
		{
			System.out.println("Running a shoot in Raju");
			weapon.use();
			weapon.fire();

		}

		public void bullet()
		{
			System.out.println("Running a bullet in Raju");
			gun.use();
			gun.fire();
			gun.trigger();
		}

	}

