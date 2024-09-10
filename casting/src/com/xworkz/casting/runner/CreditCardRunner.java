package com.xworkz.casting.runner;

import com.xworkz.casting.CreditCard;

public class CreditCardRunner {

	 public static void main(String[] args) {
	        CreditCard card1 = new CreditCard("1234567812345678", "John Doe", "12/25", "123", "Bank A", "Visa");
	        CreditCard card2 = new CreditCard("1234567812345678", "John Doe", "12/25", "456", "Bank B", "MasterCard");

	        card1.equals(card2);
	        boolean same =card1.equals(card2);
	        System.out.println("card1 is same as card2:"+same);


	}

}
