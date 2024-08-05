class AeroplaneRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in AeroplaneRunner");
		
		
		new Aeroplane();
		Aeroplane aeroplane=new Aeroplane("AirAsia","Hubli","Banglore");
		Aeroplane aeroplane1=new Aeroplane(850,"Delhi","Hyderabad");
		Aeroplane aeroplane2=new Aeroplane("Delta",100,25000,"Delhi","Chennai");
		
		System.out.println("end main in AeroplaneRunner");
		
		
	}
} 