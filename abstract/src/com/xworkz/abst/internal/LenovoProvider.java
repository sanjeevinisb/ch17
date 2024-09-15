package com.xworkz.abst.internal;

public class LenovoProvider extends Provider {
	public LenovoProvider(String name, String ceoName) {
		super(name,ceoName);
		System.out.println("running two String of LenovoProvider");
	}

	@Override
public void service() {
System.out.println("running service in LenovoProvider");
	}	

}
