package com.xworkz.inheritancerunner;
import com.xworkz.inheritance.Bull;
import com.xworkz.inheritance.Animal;

public class BullRunner {

	public static void main(String[] args) {
		Bull bull1 = new Animal();
		bull1.name="Dangi";
		bull1.weight=570;
		bull1.domestic=true;
		bull1.age=25;
		bull1.color="Brown";
        bull1.eat();
        bull1.sleep();
        bull1.makeSound();
        bull1.move();
        bull1.graze();
        System.out.println(bull1.name);
        System.out.println(bull1.weight);
        System.out.println(bull1.domestic);
        System.out.println(bull1.age);
        System.out.println(bull1.color);
        Animal animal1=new Animal();
        animal1.name="Rex";
        animal1.weight=550;
        animal1.domestic=true;
        animal1.age=52;
        animal1.color="Black";
        System.out.println(animal1.name);
        System.out.println(animal1.weight);
        System.out.println(animal1.domestic);
        System.out.println(animal1.age);
        System.out.println(animal1.color);
        animal1.eat();
        animal1.sleep();
        animal1.makeSound();
        animal1.move();
        animal1.graze();

   
	}

}
