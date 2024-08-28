package com.xworkz.inheritancerunner;
import com.xworkz.inheritance.Halwa;
import com.xworkz.inheritance.Sweet;
public class HalwaRunner {

	public static void main(String[] args) {
		Halwa halwa1=new Sweet();
		halwa1.name="Sooji Halwa";
		halwa1.quantity=3;
		halwa1.price=150;
		halwa1.taste();
		halwa1.flavour();
        System.out.println(halwa1.name);
        System.out.println(halwa1.quantity);
        System.out.println(halwa1.price);
		Sweet sweet1=new Sweet();
		sweet1.name="Badam Halwa";
		sweet1.quantity=2;
		sweet1.price=200;
		sweet1.taste();
		sweet1.flavour();
		 System.out.println(sweet1.name);
	     System.out.println(sweet1.quantity);
	     System.out.println(sweet1.price);
	}

}
