class MedicineRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in JuiceRunner");
		Medicine medicine=new Medicine();
		String name=medicine.name;
		double price=medicine.price;
		int quantity=medicine.quantity;
		
		System.out.println("medicine name:"+name);
		System.out.println("medicine price:"+price);
		System.out.println("medicine quantity:"+quantity);
		System.out.println("=========================");
		
		
		medicine.name="Paracetamol";
		medicine.price=17;
		medicine.quantity=250;
		
		System.out.println("medicine updated name:"+medicine.name);
		System.out.println("medicine updated price:"+medicine.price);
		System.out.println("medicine updated quantity:"+medicine.quantity);
		System.out.println("end main in MedicineRunner");
		
	}
		
		
}
