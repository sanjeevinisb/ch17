class MedicineNameRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting Medicine");
		String Medicine="Paracetamol";
		int price=MedicineName.price(Medicine);
		System.out.println("Price:" +price);
		String Medicine1="Acetaminophen";
		int price1=MedicineName.price(Medicine1);
		System.out.println("Price:" +price1);
		String Medicine2="Azithromycin";
		int price2=MedicineName.price(Medicine2);
		System.out.println("Price:" +price2);
		
	}
}