class CeramicItems
{
	public static double getPrice(String item)
	{
		System.out.println("starting getPrice");
		System.out.println("item:" +item);
		if(item=="Pot")
		{
			return 156;
		}
		if(item=="TeaCup")
		{
			return 200;
		}
		if(item=="Kettle")
		{
			return 300;
		}
		if(item=="Plate")
		{
			return 400;
		}
		if(item=="Bowl")
		{
			return 500;
		}
		System.out.println("No item matched");
		return 0;
	}
}
			