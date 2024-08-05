 class Speaker
 {
	 String brand="Sony";
	 int size;
	 double cost=100;
	 int output;
	 public Speaker(int size)
	 {
		 this.size=size;
	 }
	 public void setOutput(int output)
	 {
		 this.output=output;
	 }
	 public void display()
	 {
		 System.out.println("brand:"+this.brand);
		 System.out.println("size:"+this.size);
		 System.out.println("cost:"+this.cost);
		 System.out.println("output:"+this.output);
	 }
 }


		 
		 
	 