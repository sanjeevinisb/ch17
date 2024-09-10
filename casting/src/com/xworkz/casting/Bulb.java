package com.xworkz.casting;

	public class Bulb {
	    private String type;
	    private int wattage;
	    private String colorTemperature;
	    private String shape;
	    private boolean LED;
	    private double price;

	    public Bulb(String type, int wattage, String colorTemperature, String shape, boolean LED, double price) {
	        this.type = type;
	        this.wattage = wattage;
	        this.colorTemperature = colorTemperature;
	        this.shape = shape;
	        this.LED =LED;
	        this.price = price;
	    }

	    
	    @Override
	    public String toString() {
	        return "Bulb{" + "type='" + type + '\'' + ", wattage=" + wattage +", colorTemperature='" + colorTemperature + '\'' +
	   ", shape='" + shape + '\'' +", LED=" + LED +", price=" + price +'}';
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Bulb");
	        if (obj != null )
	        	{
	        	if(obj instanceof Bulb)
	        	{ 
	        		Bulb casted = (Bulb) obj;
	        if(this.wattage==casted.wattage && this.type.equals(casted.type) && this.shape.equals(casted.shape)) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Bulb");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }
	}
	    


	   

