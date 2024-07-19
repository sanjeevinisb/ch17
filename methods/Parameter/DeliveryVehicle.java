class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("running deliver in deliveryvehicle with two string parameter");
		System.out.println("item:"+item);
		System.out.println("location:"+location);
		Company.deliver(item,location);
		
	}
}