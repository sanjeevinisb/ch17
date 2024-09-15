package com.xworkz.abst.internal;

public class BookingProvider extends Provider {
	public BookingProvider(String name, String ceoName) {
		super(name,ceoName);
		System.out.println("running two String of BookingProvider");
	}

	@Override
public void service() {
System.out.println("running service in BookingProvider");
	}	

} 
