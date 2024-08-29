package com.xworkz.inheritancerunner;
import com.xworkz.inheritance.Chicken;
import com.xworkz.inheritance.Bird;

public class ChickenRunner {

	public static void main(String[] args) {
		Bird bird1 = new Bird();
		bird1.species="Brahma";
		bird1.wingspan=75;
		bird1.gender="male";
		bird1.eggCount=0;
		bird1.habitat="Moist";
		bird1.breed="American";
		bird1.weight=18;
		bird1.sound="clucking";
		bird1.quality="good";
		bird1.color="Black";
		bird1.chirp();
		bird1.fly();
		bird1.eat();
		bird1.sleep();
		bird1.migrate();
        System.out.println(bird1.species);
        System.out.println(bird1.wingspan);
        System.out.println(bird1.gender);
        System.out.println(bird1.eggCount);
        System.out.println(bird1.habitat);
        System.out.println(bird1.breed);
        System.out.println(bird1.weight);
        System.out.println(bird1.sound);
        System.out.println(bird1.quality);
        System.out.println(bird1.color);
        Chicken chicken1=new Bird();
        chicken1.species="Cochin";
        chicken1.wingspan=85;
        chicken1.gender="male";
        chicken1.eggCount=0;
        chicken1.habitat="Grass";
       	chicken1.breed="Indian";
        chicken1.weight=28;
        chicken1.sound="clucking";
        chicken1.quality="best";
        chicken1.color="Brown";
        chicken1.chirp();
        chicken1.fly();
        chicken1.eat();
        chicken1.sleep();
        chicken1.migrate();
        System.out.println(chicken1.species);
        System.out.println(chicken1.wingspan);
        System.out.println(chicken1.gender);
        System.out.println(chicken1.eggCount);
        System.out.println(chicken1.habitat);
        System.out.println(chicken1.breed);
        System.out.println(chicken1.weight);
        System.out.println(chicken1.sound);
        System.out.println(chicken1.quality);
        System.out.println(chicken1.color);


	}

}
