 class GroceryRunner
{
	
	
	public static void main(String[] items)
	
	{
		
		System.out.println("starting main in GroceryRunner");
		
		
		String vegetable="Onion";
		String vegetable1="Tomato";
		String teaPowder="Red Label";
		String paste="Close-Up";
		String soap="Mysore Sandal";
		String oil="Saffola";
		//ref: element
		
		
		String[] container={vegetable,vegetable1,teaPowder,paste,soap,oil,"Sugar"};
		
		int total=container.length;  //non-static variable
		
		System.out.println("Total items:"+total);
		
		
		String ref=container[4];
		
		System.out.println("Element @ index 4:"+ref);
		
		String ref1=container[3];
		System.out.println("Element @ index 3:"+ref);
	}
}