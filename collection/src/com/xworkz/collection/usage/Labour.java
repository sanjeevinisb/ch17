package com.xworkz.collection.usage;

import com.xworkz.collection.functional.FoodApp;
import com.xworkz.collection.functional.Starter;

public class Labour {
public void startMotor(Starter starter) {
	System.out.println("Running StartMotor in Labour");
	if(starter!=null) {
		System.out.println("starter is not null");
		starter.on();
	}
	else {
		System.out.println("Starter is null");
	}
	System.out.println("Exit StartMotor in Labour");
}



public void orderFood(FoodApp foodApp) {
	if(foodApp!=null) {
		foodApp.order("idli");
	
}
}
}
