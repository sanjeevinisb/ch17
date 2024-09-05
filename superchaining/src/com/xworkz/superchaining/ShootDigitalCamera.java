package com.xworkz.superchaining;

public class ShootDigitalCamera extends DigitalCamera{
		
		public void Capture()
		{
			System.out.println("running capture in ShootDigitalCamera");
			
		}
		
		@Override
		public void share(String device)
		{
			System.out.println("running share in DigitalCamera");
		}

	}

