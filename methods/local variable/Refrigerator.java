class Refrigerator
{
	public static void temperature(String name)
	{
		System.out.println("running temperature in refrigerator with string parameter");
		System.out.println("Name:"+name);
	}
	
	public static void cooling(String name,double price)
	{
		System.out.println("running cooling in refrigerator with one string & one double parameter");
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
	}
	
	public static void costEffective(String name,double price,int quality)
	{
		System.out.println("running costEffective in refrigerator with one string,one double & one int parameter");
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Quality:"+quality);
	}
	
	public static void variety(char size,int capacity)
	{
		System.out.println("running variety in refrigerator with one char & one int parameter");
		System.out.println("Size:"+size);
		System.out.println("Capacity:"+capacity);
	}
	
	public static void customized(String name,String colour,double height,float weight)
	{
		System.out.println("running customized in refrigerator with two string,one double & one float parameter");
		System.out.println("Name:"+name);
		System.out.println("Colour:"+colour);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
	}
	
	
}