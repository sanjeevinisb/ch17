package com.xworkz.casting;

public class Kettle {
	    private String brand;
	    private double capacity; 
	    private String color;
	    private boolean Electric;
	    private int power; 
	    private String material;

	   
	    public Kettle(String brand, double capacity, String color, boolean Electric, int power, String material) {
	        this.brand = brand;
	        this.capacity = capacity;
	        this.color = color;
	        this.Electric = Electric;
	        this.power = power;
	        this.material = material;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public double getCapacity() {
	        return capacity;
	    }

	    public void setCapacity(double capacity) {
	        this.capacity = capacity;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean Electric() {
	        return Electric;
	    }

	    public void setElectric(boolean electric) {
	        Electric = electric;
	    }

	    public int getPower() {
	        return power;
	    }

	    public void setPower(int power) {
	        this.power = power;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    @Override
	    public String toString() {
	        return "Kettle{" +"brand='" + brand + '\'' + ", capacity=" + capacity +
	      ", color='" + color + '\'' +", Electric=" + Electric +","
	      + " power=" + power +", material='" + material + '\'' +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Kettle");
	        if (obj != null )
	        	{
	        	if(obj instanceof Kettle)
	        	{ 
	        		Kettle casted = (Kettle) obj;
	        if(this.capacity==casted.capacity && this.brand.equals(casted.brand) && this.power==casted.power) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not kettle");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	    }
	    
	    }
	
