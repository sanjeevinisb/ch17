class Code
{
	public static String country(double code)
	{
		System.out.println("starting country");
		System.out.println("code:" +code);
		if(code==+91)
		{
			return"India";
		}
		if(code==+1)
		{
			return"United States";
		}
		if(code==+86)
		{
			return"china";
		}
		if(code==+81)
		{
			return"Japan";
		}
		if(code==+972)
		{
			return"Israel";
		}
		System.out.println("Code not found");
		return"Code not found";
	}
}
			
		