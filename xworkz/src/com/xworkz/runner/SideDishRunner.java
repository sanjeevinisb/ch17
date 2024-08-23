package com.xworkz.runner;
import  com.xworkz.data.SideDishData;
import  com.xworkz.store.SideDishStore;

public class SideDishRunner {

	public static void main(String[] args) {
		SideDishStore sideDishStore=new SideDishStore();
		sideDishStore.display();
		
		
		SideDishData data1=new SideDishData("Noddles", 100, "Veg");
		sideDishStore.save(data1);
		sideDishStore.display();
		
		SideDishData data2=new SideDishData("Roti", 50, "Veg");
		sideDishStore.save(data2);
		sideDishStore.display();
		
		SideDishData data3=new SideDishData("Pizza", 200, "Veg");
		sideDishStore.save(data3);
		sideDishStore.display();
		
		SideDishData data4=new SideDishData("Chicken", 250, "Non Veg");
		sideDishStore.save(data4);
		sideDishStore.display();
		
		SideDishData data5=new SideDishData("Chicken Lolipop", 3500, "Non Veg");
		sideDishStore.save(data5);
		sideDishStore.display();
		
	}


}

