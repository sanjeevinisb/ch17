class Train
{
	public static void book(String source,String destination)
	{
		System.out.println("running book in train with the two string parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
	
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("running book in train with the two string parameter,int parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
	}
	
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("running book in train with the two string parameter,int parameter,double parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		
	}
	
	public static void cancel(int ticketNo)
	{
		System.out.println("running cancel in train with int parameter");
		System.out.println("TicketNo:"+ticketNo);	
	}
    public static void cancel(String source,String destination)
	{
        System.out.println("running cancel in train with the two string parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);

	
}
}