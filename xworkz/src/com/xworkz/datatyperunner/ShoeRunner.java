package com.xworkz.datatyperunner;
import com.xworkz.datatype.Sleepers;
import com.xworkz.datatype.Sandal;
import com.xworkz.datatype.Shoe;
import com.xworkz.datatype.FootWear;

public class ShoeRunner {

	public static void main(String[] args) {
		Sleepers sleepers=new Sleepers();
		sleepers.move();//local
		
		Sandal sandal=new Sandal();
		Shoe shoe1=new Shoe();
		sandal.protect(shoe1);//parameter
		
		FootWear footWear=new FootWear();
        Shoe shoe2=new Shoe();
        footWear. shoe= shoe2;
        footWear.flat();//instance 
 
	}

	}






