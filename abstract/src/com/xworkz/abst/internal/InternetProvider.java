package com.xworkz.abst.internal;

public class InternetProvider extends Provider {
	
	public InternetProvider(String name, String ceoName) {
		super(name,ceoName);
		System.out.println("running two String of InternetProvider");
	}

	@Override
public void service() {
System.out.println("running service in InternetProvider");
	}	
}

