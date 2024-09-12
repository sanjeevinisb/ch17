package com.xworkz.polymorphism.runtime;

public class Blanket {
	    public void cover() {
	        System.out.println("running cover in Blanket");
	    }
	}

	class Wool extends Blanket {
	    @Override
	    public void cover() {
	        System.out.println("Warm");
	    }
	}

	class Cotton extends Blanket {
	    @Override
	    public void cover() {
	        System.out.println("Heat");
	    }
	}

	

