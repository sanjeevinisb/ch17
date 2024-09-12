package com.xworkz.date;

import java.time.LocalDateTime;
public class futuredateTime {



		public static void main(String[] args) {


		LocalDateTime futureDateTime = LocalDateTime.now().plusDays(10).plusHours(5); 
	        System.out.println("Future DateTime: " + futureDateTime);
	    }


	}


