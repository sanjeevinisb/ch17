package com.xworkz.abst.internal;

public class SatJioInternetProvider extends JioInternetProvider{

	public double cost;
	public double launchDate;

	public SatJioInternetProvider(String name, String ceoName, double cost, double launchDate) {
		super(name, ceoName);
		this.cost=cost;
		this.launchDate=launchDate;
		System.out.println("running two String of Satellite JioInternetProvider");
	}
}
