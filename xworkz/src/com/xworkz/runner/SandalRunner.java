package com.xworkz.runner;
import com.xworkz.data.Sandal;
import com.xworkz.store.SandalStore;
public class SandalRunner {

	public static void main(String[] args) {
		SandalStore sandalStore=new SandalStore();
		sandalStore.details();
		
		
		Sandal sandalData1=new Sandal("Paragon", 'M', 500, "Black");
		sandalStore.save(sandalData1);
		sandalStore.details();
		
		Sandal sandalData2=new Sandal("Bata", 'L', 1000, "Grey");
		sandalStore.save(sandalData2);
		sandalStore.details();
		
		Sandal sandalData3=new Sandal("Woodland", 's', 5000, "Brown");
		sandalStore.save(sandalData3);
		sandalStore.details();
		
		Sandal sandalData4=new Sandal("Nike", 'M', 800, "Pink");
		sandalStore.save(sandalData4);
		sandalStore.details();
		
		Sandal sandalData5=new Sandal("Liberty", 'X', 1000, "Black");
		sandalStore.save(sandalData5);
		sandalStore.details();
		
		
		
		
		

	}


	}


