package com.xworkz.datatyperunner;
import com.xworkz.datatype.Cat;
import com.xworkz.datatype.Animal;
import com.xworkz.datatype.Domestic;
import com.xworkz.datatype.Paw;

public class CatRunner {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.drink();//local
		
		Domestic domestic=new Domestic();
		Cat cat1=new Cat();
		domestic.care(cat1);//parameter
		
		Paw paw=new Paw();
		Cat cat2=new Cat();
		paw. cat= cat2;
        paw.feet();//instance 
 
	}

	}

	
