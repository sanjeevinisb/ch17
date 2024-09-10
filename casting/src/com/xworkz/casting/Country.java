package com.xworkz.casting;

public class Country {
	    private String name;
	    private String capital;
	    private int population;
	    private double area;
	    private String officialLanguage;
	    private String currency;

	    public Country(String name, String capital, int population, double area, String officialLanguage, String currency) {
	        this.name = name;
	        this.capital = capital;
	        this.population = population;
	        this.area = area;
	        this.officialLanguage = officialLanguage;
	        this.currency = currency;
	    }

	    @Override
	    public String toString() {
	        return "Country{" +"name='" + name + '\'' +", capital='" + capital + '\'' +
", population=" + population +", area=" + area +", officialLanguage='" + officialLanguage + '\'' +
", currency='" + currency + '\'' +'}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in Country");
	        if (obj != null )
	        	{
	        	if(obj instanceof Country)
	        	{ 
	        		Country casted = (Country) obj;
	        if(this.population==casted.population && this.name.equals(casted.name) && this.capital.equals(casted.capital)) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Country");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }


	   
	    }
	
