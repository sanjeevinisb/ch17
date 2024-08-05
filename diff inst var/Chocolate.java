class Chocolate
{
	 String brand="Bournville";
	 double price;
     String flavour;
	 int size;
	 public Chocolate(int size)
	 {
		 this.size=size;
	 }
	 public void setFlavour(String flavour)
	 {
		 this.flavour=flavour;
	 }
	 public void display()
	 {
		 System.out.println("brand:"+this.brand);
		 System.out.println("price:"+this.price);
		 System.out.println("flavour:"+this.flavour);
		 System.out.println("size:"+this.size);
	 }
 }


		 
		 