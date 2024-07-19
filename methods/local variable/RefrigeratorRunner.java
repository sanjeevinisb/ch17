class RefrigeratorRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in refrigeratorRunner");
		Refrigerator.temperature("samsung");
		Refrigerator.cooling("LG",80000);
		Refrigerator.costEffective("samsung",80000,100);
		Refrigerator.variety('M',80);
		Refrigerator.customized("LG","silver",139.7,50.8F);
		
	}
}