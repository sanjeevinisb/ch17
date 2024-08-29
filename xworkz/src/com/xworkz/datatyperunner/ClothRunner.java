package com.xworkz.datatyperunner;
import com.xworkz.datatype.Women;
import com.xworkz.datatype.Doll;
import com.xworkz.datatype.Cloth;
import com.xworkz.datatype.Dress;
import com.xworkz.datatype.Fabric;
public class ClothRunner {

	public static void main(String[] args) {

			Women women=new Women();
			women.wear();
			Doll doll=new Doll();
			Cloth cloth=new Cloth("Zudio", 400, "M");
			doll.put(cloth);
			Dress dress =new Dress();
			dress.show();
			Fabric fabric=new Fabric();
			fabric.material();
		}

	

	}


