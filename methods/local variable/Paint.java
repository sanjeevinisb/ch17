class Paint
{
	public static void material(String brand)
	{
		System.out.println("running material in paint with the string parameter");
		System.out.println("Brand:"+brand);
	}
	
	public static void mixture(String brand,String colour)
	{
		System.out.println("running mixture in paint with the two string parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Colour:"+colour);
	}
	
	public static void solid(String brand,double price)
	{
		System.out.println("running solid in paint with one string & one double parameter");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		
	}
	
	public static void ingredients(String colour,String type,double price)
	{
		System.out.println("running ingredients in paint with two string & one double parameter");
		System.out.println("Colour:"+colour);
		System.out.println("Type:"+type);
		System.out.println("Price:"+price);
		
	}	
}