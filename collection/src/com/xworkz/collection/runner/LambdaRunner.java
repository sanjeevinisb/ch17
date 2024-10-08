package com.xworkz.collection.runner;

import com.xworkz.collection.functional.Starter;

import com.xworkz.collection.usage.Labour;
import com.xworkz.collection.functional.FoodApp;

public class LambdaRunner {

	public static void main(String[] args) 
	{
Starter starter=()->{
	System.out.println("running on in LambdaRunner");
};
Labour labour=new Labour();
labour.startMotor(starter);

	}

FoodApp foodApp=(String item)->{
	System.out.println("item from usage class:"+item);
};
Labour labour=new Labour();
labour.orderFood(foodApp);
	}

 


