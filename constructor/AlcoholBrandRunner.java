class AlcoholBrandRunner
{
	public static void main(String[] args)
	{ 
	System.out.println("start main in AlcoholBrandRunner");
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String name=alcoholBrand.name;
	    double price=alcoholBrand.price;
	    int quantity=alcoholBrand.quantity;
		System.out.println("alcoholBrand name:"+name);
		System.out.println("alcoholBrand price:"+price);
		System.out.println("alcoholBrand quantity:"+quantity);
		alcoholBrand.name="Bacardi";
		alcoholBrand.price=185;
		alcoholBrand.quantity=750;
		System.out.println("alcoholBrand update name:"+alcoholBrand.name);
		System.out.println("alcoholBrand update price:"+alcoholBrand.price);
		System.out.println("alcoholBrand update quantity:"+alcoholBrand.quantity);
		System.out.println("end main in AlcoholBrandRunner");
		
	}
}
		
		