 class FruitRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in FruitRunner");
		Fruit fruit=new Fruit();
		String name=fruit.name;
		String season=fruit.season;
		Boolean healthy=fruit.healthy;
		
		System.out.println("fruit name:"+name);
		System.out.println("fruit season:"+season);
		System.out.println("fruit healthy:"+healthy);
		System.out.println("========================");
		
		fruit.name="Mango";
		fruit.season="Summer";
		fruit.healthy=true;
		
		System.out.println("fruit name updated:"+fruit.name);
		System.out.println("fruit season updated:"+fruit.season);
		System.out.println("fruit healthy updated:"+fruit.healthy);
		
		System.out.println("end main in FruitRunner");
	}
}