class Clip
  {
  String color;
  String type;
  
  public Clip(String color,String type)
  {
	  this.color=color;
	  this.type=type;
	  System.out.println("created Clip using String and String");
  }
      public void details()
	  {
		  System.out.println("Clip color:"+color);		  
		  System.out.println("Clip type:"+type);
	  }
  }