package com.xworkz.information.runner;
import com.xworkz.information.internal.Details;
import com.xworkz.information.internal.Person;
public class MainRunner {


		public static void main(String[] args) {

			Person person1 = new Person("Sanjeevini", "sanjeevini@gmail.com", 22, 9908767541L);
			person1.store(person1);
			person1.display();


			Person person2 = new Person("Sneha", "sneha@gmail.com", 21, 9903487612L);
			person2.store(person2);
			person2.display();


			Person person3 = new Person("Nikhita", "nikhita@gmail.com", 23, 7798534217L);
			person3.store(person3);
			person3.display();


			Person person4 = new Person("Bharati", "bharati@gmail.com", 24, 9483667290L);
			person4.store(person4);
			person4 .display();


			Person person5 = new Person("Sindhu", "sindhu@gmail.com", 25, 9904785321);
			person5.store(person5);
			person5.display();

			
		}



	}
	
