package com.xworkz.inheritancerunner;
import com.xworkz.inheritance.SmartPhone;
import com.xworkz.inheritance.TouchScreen;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		TouchScreen touchScreen1=new TouchScreen();
		touchScreen1.brand="samsung";
		touchScreen1.model="Galaxy S23";
		touchScreen1.price=25000;
		touchScreen1.batteryCapacity=256;
		touchScreen1.display();
		touchScreen1.call();
		System.out.println(touchScreen1.brand);
		System.out.println(touchScreen1.model);
		System.out.println(touchScreen1.price);
		System.out.println(touchScreen1.batteryCapacity);
		SmartPhone smartPhone1=new TouchScreen();
		smartPhone1.brand="Vivo";
		smartPhone1.model="Y21";
		smartPhone1.price=17000;
		smartPhone1.batteryCapacity=5000;
		smartPhone1.display();
		smartPhone1.call();
		System.out.println(smartPhone1.brand);
		System.out.println(smartPhone1.model);
		System.out.println(smartPhone1.price);
		System.out.println(smartPhone1.batteryCapacity);
	}

}
