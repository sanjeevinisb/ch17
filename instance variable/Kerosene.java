class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene()
	{
		System.out.println("created kerosene with no parameter");
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		
		System.out.println("Price updated:"+price);
		System.out.println("Quantity updated:"+quantity);
		System.out.println("Quality updated:"+quality);
	}
	
	Kerosene(double price)
	{
		System.out.println("created kerosene using double");
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		
		System.out.println("Price updated:"+price);
		System.out.println("Quantity updated:"+quantity);
		System.out.println("Quality updated:"+quality);
	}
	
	Kerosene(boolean quality)
	{
		System.out.println("created kerosene using boolean");
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		
		System.out.println("Price updated:"+price);
		System.out.println("Quantity updated:"+quantity);
		System.out.println("Quality updated:"+quality);
		
	}
	
	Kerosene(double price,int quantity,boolean quality)
	{
		System.out.println("created kerosene using double,int,boolean");
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		
		System.out.println("Price updated:"+price);
		System.out.println("Quantity updated:"+quantity);
		System.out.println("Quality updated:"+quality);
		
	}
}