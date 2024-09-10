package com.xworkz.casting;

public class Bedsheet {
	
	    private String material;
	    private String color;
	    private String pattern;
	    private double length;
	    private double width;
	    private String brand;

	    
	    public Bedsheet(String material, String color, String pattern, double length, double width, String brand) {
	        this.material = material;
	        this.color = color;
	        this.pattern = pattern;
	        this.length = length;
	        this.width = width;
	        this.brand = brand;
	    }

	 
	    @Override
	    public String toString() {
	        return "Bedsheet{" +"material='" + material + '\'' +", color='" + color + '\'' +
", pattern='" + pattern + '\'' +", length=" + length +", width=" + width +
	              ", brand='" + brand + '\'' +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Bedsheet");
	        if (obj != null )
	        	{
	        	if(obj instanceof Bedsheet)
	        	{ 
	        		Bedsheet casted = (Bedsheet) obj;
	        if(this.length==casted.length && this.material.equals(casted.material) && this.width==casted.width) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Bedsheet");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }
	   

	   
}
