  class Key
  {
  String brand;
  double weight;
  
  public Key(String brand,double weight)
  {
	  this.brand=brand;
	  this.weight=weight;
	  System.out.println("created Key using String and double");
  }
      public void display()
	  {
		  System.out.println("Key brand:"+brand);		  
		  System.out.println("Key weight:"+weight);
	  }
  }