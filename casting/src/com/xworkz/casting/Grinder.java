package com.xworkz.casting;

public class Grinder {
	
	    private String brand;
	    private String model;
	    private int grindSize;
	    private double capacity;
	    private boolean Electric;
	    private double price;

	   
	    public Grinder(String brand, String model, int grindSize, double capacity, boolean Electric, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.grindSize = grindSize;
	        this.capacity = capacity;
	        this.Electric = Electric;
	        this.price = price;
	    }

	    public String getBrand() { 
	    	return brand; 
	    	}
	    public void setBrand(String brand) { 
	    	this.brand = brand; 
	    	}

	    public String getModel() {
	    	return model; 
	    	}
	    public void setModel(String model) { 
	    	this.model = model; 
	    	}

	    public int getGrindSize() { 
	    	return grindSize; 
	    	}
	    public void setGrindSize(int grindSize) {
	    	this.grindSize = grindSize; 
	    	}

	    public double getCapacity() { 
	    	return capacity; 
	    	}
	    public void setCapacity(double capacity) { 
	    	this.capacity = capacity; 
	    	}

	    public boolean Electric() { 
	    	return Electric; 
	    	}
	    public void setElectric(boolean Electric) { 
	    	this.Electric = Electric; 
	    	}

	    public double getPrice() { 
	    	return price;
	    	}
	    public void setPrice(double price) { 
	    	this.price = price; 
	    	}

	    @Override
	    public String toString() {
	        return "Grinder{" + "brand='" + brand + '\'' +", model='" + model + '\'' +
", grindSize=" + grindSize +", capacity=" + capacity +", Electric=" + Electric +
	                ", price=" + price +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Grinder");
	        if (obj != null )
	        	{
	        	if(obj instanceof Grinder)
	        	{ 
	        		Grinder casted = (Grinder) obj;
	        if(this.capacity==casted.capacity && this.brand.equals(casted.brand) && this.price==casted.price) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Grinder");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	    }
	    
}
