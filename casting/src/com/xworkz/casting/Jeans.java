package com.xworkz.casting;

public class Jeans {
	    private String brand;
	    private String color;
	    private int size;
	    private String material;
	    private int length;
	    private String style;

	    public Jeans(String brand, String color, int size, String material, int length, String style) {
	        this.brand = brand;
	        this.color = color;
	        this.size = size;
	        this.material = material;
	        this.length = length;
	        this.style = style;
	    }

	   

	    @Override
		public String toString() {
			return "Jeans [brand=" + brand + ", color=" + color + ", size=" + size + ", material=" + material
					+ ", length=" + length + ", style=" + style + "]";
		}



		@Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Jeans");
	        if (obj != null )
	        	{
	        	if(obj instanceof Jeans)
	        	{ 
	        Jeans casted = (Jeans) obj;
	        if(this.size==casted.size && this.brand.equals(casted.brand) && this.length==casted.length) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Jeans");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	    }
	    }


	   
