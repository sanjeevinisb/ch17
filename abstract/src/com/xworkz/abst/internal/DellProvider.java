package com.xworkz.abst.internal;

public class DellProvider extends Provider {
	public DellProvider(String name, String ceoName) {
		super(name,ceoName);
		System.out.println("running two String of DellProvider");
	}

	@Override
public void service() {
System.out.println("running service in DellProvider");
	}	

}
