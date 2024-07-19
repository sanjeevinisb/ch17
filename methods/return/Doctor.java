class Doctor
{
	public static String returnAvailability(String doctorName)
	{
		System.out.println("running returnAvailability in doctor");
		System.out.println("DoctorName:"+doctorName);
		
		if(doctorName=="Dr.Ankit Bhojani")
		{
			return"average";
		}
		if(doctorName=="Dr.H.S.Mrutyunjaya")
		{
			return"high";
		}
		if(doctorName=="Dr.Ashwath Narayan")
		{
			return"low";
		}
		
		System.out.println("Doctor Name Not Found");
		return"returnAvailability also Not Found";
	}
}