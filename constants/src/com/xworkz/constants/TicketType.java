package com.xworkz.constants;

public enum TicketType {
	
	    ONLINE(280), OFFLINE(300);

	    private int cost;

	   private TicketType(int cost) {
	        this.cost = cost;
	    }

	    public int getCost() {
	        return cost;
	    }
	}


