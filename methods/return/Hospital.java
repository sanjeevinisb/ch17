class Hospital
{
	public static boolean availability(String doctorName)
	{
		System.out.println("Running availability in Doctor");
		System.out.println("doctorName arg:" +doctorName);
		
		if(doctorName==" Dr.Kiran S G")
		{
			return true;
		}
		
		if(doctorName=="Dr. K.N rao")
		{
			return true;
		}
		System.out.println("Not Found");
		return false;
		
	}
}















