package com.xworkz.superchainingrunner;
import com.xworkz.superchaining.MetroTrain;
import com.xworkz.superchaining.SubUrbanTrain;
import com.xworkz.superchaining.Train;
public class TrainRunner {

			public static void main(String[] args) {

				MetroTrain metroTrain = new MetroTrain(1723,"Mumbai");
				metroTrain.display();

				MetroTrain metroTrain1 = new MetroTrain();
				metroTrain1.display();

				Train metroTrain2 = new MetroTrain(3678,"Delhi","Hyderabad");
				metroTrain2.display();
			
				SubUrbanTrain subUrbanTrain = new SubUrbanTrain(3367,"Hubli");
				subUrbanTrain.display();

				SubUrbanTrain subUrbanTrain1 = new SubUrbanTrain();
				subUrbanTrain1.display();

				Train subUrbanTrain2 = new SubUrbanTrain(4352,"Indoor","Goa");
				subUrbanTrain2.display();
			}

		}

	
