package com.xworkz.casting;

public class Saree {

    private String fabric;
    private String color;
    private String design;
    private double length;
    private double width;
    private String brand;


    public Saree(String fabric, String color, String design, double length, double width, String brand) {
        this.fabric = fabric;
        this.color = color;
        this.design = design;
        this.length = length;
        this.width = width;
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Saree{" +"fabric='" + fabric + '\'' +", color='" + color + '\'' +", design='" + design + '\'' +", length=" + length +","
       + " width=" + width +", brand='" + brand + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
    	System.out.println("running equals in Saree");
        if (obj != null )
        	{
        	if(obj instanceof Saree)
        	{ 
        		Saree casted = (Saree) obj;
        if(this.length==casted.length && this.color.equals(casted.color) && this.width==casted.width) 
        	System.out.println("this & obj content is matching");
        return true;
        	}
        	else {
        	System.out.println("obj is not Saree");
        	}
        	}
        else {
        	System.out.println("obj is null");
        }
        	return super.equals(obj);
        }
}
