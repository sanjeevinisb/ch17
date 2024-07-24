class JuiceRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in JuiceRunner");
		Juice juice=new Juice();
		String name=juice.name;
		double price=juice.price;
		int quantity=juice.quantity;
		
		System.out.println("juice name:"+name);
		System.out.println("juice price:"+price);
		System.out.println("juice quantity:"+quantity);
		System.out.println("=========================");
		
		
		juice.name="Mango";
		juice.price=25;
		juice.quantity=250;
		
		System.out.println("juice updated name:"+juice.name);
		System.out.println("juice updated price:"+juice.price);
		System.out.println("juice updated quantity:"+juice.quantity);
		System.out.println("end main in JuiceRunner");
		
	}
		
		
}
