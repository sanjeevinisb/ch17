class CandyRunner
{
		public static void main(String[] args)
		{
	  System.out.println("start main in CandyRunner");
	    Candy candy=new Candy();
        String name=candy.name;
        double price=candy.price;
        int quantity=candy.quantity;
        System.out.println("candy name:"+name);
		System.out.println("candy price:"+price);
		System.out.println("candy quantity:"+quantity);
		candy.name="Twix";
		candy.price=70;
		candy.quantity=50;
		System.out.println("candy update name:"+candy.name);
		System.out.println("candy update price:"+candy.price);
		System.out.println("candy update quantity:"+candy.quantity);
		System.out.println("end main in CandyRunner");
	}
}
		