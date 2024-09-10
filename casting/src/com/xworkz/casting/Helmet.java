package com.xworkz.casting;

public class Helmet {
	    private String brand;
	    private String model;
	    private String color;
	    private int size;
	    private double weight;
	    private boolean hasVisor;

	    public Helmet(String brand, String model, String color, int size, double weight, boolean hasVisor) {
	        this.brand = brand;
	        this.model = model;
	        this.color = color;
	        this.size = size;
	        this.weight = weight;
	        this.hasVisor = hasVisor;
	    }

	    @Override
	    public String toString() {
	        return "Helmet{" +"brand='" + brand + '\'' +", model='" + model + '\'' +
", color='" + color + '\'' +", size=" + size +", weight=" + weight +
", hasVisor=" + hasVisor +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Helmet");
	        if (obj != null )
	        	{
	        	if(obj instanceof Helmet)
	        	{ 
	        		Helmet casted = (Helmet) obj;
	        if(this.brand.equals(casted.brand) && this.model.equals(casted.model) && this.color.equals(casted.color)) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Helmet");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }

	    
	  
	}

