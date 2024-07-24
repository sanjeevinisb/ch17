class FoodDeliveryCompanyRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in FoodDeliveryCompany");
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String ref=foodDeliveryCompany.companyName;
		System.out.println("foodDeliveryCompany companyName:"+ref);
		String ref1=foodDeliveryCompany.foodItem;
		System.out.println("foodDeliveryCompany foodItem:"+ref1);
		String ref2=foodDeliveryCompany.orderMode;
		System.out.println("foodDeliveryCompany orderMode:"+ref2);
		System.out.println("end main in FoodDeliveryCompany");
	}
}