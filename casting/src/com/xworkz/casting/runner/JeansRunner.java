package com.xworkz.casting.runner;
import com.xworkz.casting.Jeans;

public class JeansRunner {
	 
    public static void main(String[] args) {
        Jeans jeans1 = new Jeans("Levi's", "Blue", 32, "Denim", 34, "Slim Fit");
        Jeans jeans2 = new Jeans("Wrangler", "Black", 32, "Cotton", 34, "Regular Fit");
        jeans1.equals(jeans2);
        boolean same =jeans1.equals(jeans2);
        System.out.println("jeans1 is same as jeans2:"+same);
        

       
    }

}
