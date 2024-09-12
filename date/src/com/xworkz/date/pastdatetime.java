package com.xworkz.date;

import java.time.LocalDateTime;

public class pastdatetime {
	  public static void main(String[] args) {



	        LocalDateTime pastDateTime = LocalDateTime.now().minusDays(10).minusHours(5); 
	        System.out.println("Past DateTime: " + pastDateTime);
	    }


	}


