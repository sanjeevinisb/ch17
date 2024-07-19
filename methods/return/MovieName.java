class MovieName 
{
	public static String producerName(String movieName)
	{
		System.out.println("running movieName in producerName");
		System.out.println("movieName:"+movieName);
		if(movieName=="Chhichhore")
		{
			return"Sajid Nadiadwala";
		}
		if(movieName=="Eega")
		{
			return"Vaaraahi Chalana Chitram";
		}
		if(movieName=="Manikarnika")
		{
			return"Zee Studios";
		}
		if(movieName=="Amruthavarshini")
		{
			return"Bharathi Devi";
		}
		if(movieName=="Thalavi")
		{
			return"Vishnu Induri";
		}
		
		System.out.println("Movie name not found");
		return "Not Found";
	}
}
 