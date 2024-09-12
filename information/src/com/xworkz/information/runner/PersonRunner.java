package com.xworkz.information.runner;
import com.xworkz.information.internal.Details;
import com.xworkz.information.internal.Person;

public class PersonRunner {
	

		public static void main(String[] args) {

			Details details = new Details();

			Person person1 = new Person("Sanjeevini", "sanjeevini@gmail.com", 22, 9908767541L);
			details.store(person1);



			Person person2 = new Person("Sneha", "sneha@gmail.com", 21, 9903487612L);
			details.store(person2);



			Person person3 = new Person("Nikhita", "nikhita@gmail.com", 23, 7798534217L);
			details.store(person3);



			Person person4 = new Person("Bharati", "bharati@gmail.com", 24, 9483667290L);
			details.store(person4);



			Person person5 = new Person("Sindhu", "sindhu@gmail.com", 25, 9904785321L);
			details.store(person5);




	}

}
