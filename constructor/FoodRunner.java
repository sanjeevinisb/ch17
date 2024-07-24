class FoodRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in FoodRunner");
		Food food=new Food();
		String name= food.name;
		double price= food.price;
		int quantity=food.quantity;
		
		System.out.println("food name:"+name);
		System.out.println("food price:"+price);
		System.out.println("food quantity:"+quantity);
		System.out.println("=========================");
		
		
		food.name="Fried Rice";
		food.price=100;
		food.quantity=2;
		
		System.out.println("food updated name:"+food.name);
		System.out.println("food updated price:"+food.price);
		System.out.println("food updated quantity:"+food.quantity);
		System.out.println("end main in FoodRunner");
		
	}
		
		
}
