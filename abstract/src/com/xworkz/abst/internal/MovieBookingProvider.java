package com.xworkz.abst.internal;


	public class MovieBookingProvider extends BookingProvider{

		int noOfTickets;

		public MovieBookingProvider(String name, String ceoName) {
		super(name, ceoName);
		}


		public void book() {
			System.out.println(" running Book method in Movie Booking Provider");
		}

		public void cancel() {
			System.out.println("running Cancel method in Movie Booking Provider");
		}

	}
