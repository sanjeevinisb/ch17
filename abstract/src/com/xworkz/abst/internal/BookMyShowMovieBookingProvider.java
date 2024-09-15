package com.xworkz.abst.internal;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider {

	public int totalHalls;

	public BookMyShowMovieBookingProvider(String name, String ceoName, int totalHalls) {
		super(name, ceoName);
		this.totalHalls = totalHalls;
		System.out.println("Constructor of Book My Show with name, CeoName and TotalHalls");
	}

}
