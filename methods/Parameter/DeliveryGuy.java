class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("running deliver in deliveryguy with the string parameter");
		System.out.println("item:"+item);
		DeliveryVehicle.deliver(item,"Rajajinagar");
	}
}