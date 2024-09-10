package com.xworkz.casting;

public class Gun {
	    private String brand;
	    private String model;
	    private int caliber;
	    private int capacity;
	    private double weight;
	    private boolean SemiAutomatic;

	    public Gun(String brand, String model, int caliber, int capacity, double weight, boolean SemiAutomatic) {
	        this.brand = brand;
	        this.model = model;
	        this.caliber = caliber;
	        this.capacity = capacity;
	        this.weight = weight;
	        this.SemiAutomatic = SemiAutomatic;
	    }


	    @Override
	    public String toString() {
	        return "Gun{" +"brand='" + brand + '\'' +", model='" + model + '\'' +
", caliber=" + caliber +", capacity=" + capacity +", weight=" + weight +
", SemiAutomatic=" + SemiAutomatic +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Gun");
	        if (obj != null )
	        	{
	        	if(obj instanceof Gun)
	        	{ 
	        		Gun casted = (Gun) obj;
	        if(this.capacity==casted.capacity && this.brand.equals(casted.brand) && this.model.equals(casted.model)) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Gun");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }

	    
	}

