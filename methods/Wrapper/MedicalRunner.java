class MedicalRunner
{
	public static void main(String[] args)
	{
		if(args.length==4)
		{
			String name=args[0];
			String manufactureDate=args[1];
            String price=args[2];
			String quantity=args[3];
			float convertedPrice=Float.parseFloat(price);
			int convertedQuantity=Integer.parseInt(quantity);
			Medical.medicineInfo(name,manufactureDate,convertedPrice,convertedQuantity);
		}
		else
		{
			System.out.println("4 args required");
		}
	}
}
 