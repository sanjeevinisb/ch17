package com.xworkz.datatyperunner; 
import com.xworkz.datatype.Abhishek;
import com.xworkz.datatype.Bhumika;
import com.xworkz.datatype.Lakshmi;
import com.xworkz.datatype.Megha;
import com.xworkz.datatype.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		Megha megha = new Megha();
		megha.wash();
		Lakshmi lakshmi = new Lakshmi();
		WashingMachine washingMachine = new WashingMachine("LG", "topload", 7);
		lakshmi.spin(washingMachine);
		WashingMachine washingMachine1 = new WashingMachine("Godrej", "frontload", 8);
		Abhishek abhishek = new Abhishek(washingMachine1);
		abhishek.dry();
		Bhumika bhumika = new Bhumika();
		bhumika.delay();
		
	}

	}


