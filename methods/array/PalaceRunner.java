class PalaceRunner
{
	public static void main(String[] palace)
	{
		System.out.println("start main palace");
		
		if(palace.length==4)
		{
			System.out.println("Getting 4 refrences from main method");
		
		String name=palace[0];
		String location=palace[1];
		String builtBy=palace[2];
        String buildYear=palace[3];
		
		   System.out.println("Name:"+name);
		   System.out.println("Location:"+location);
		   System.out.println("BulitBy:"+builtBy);
		   System.out.println("BuildYear:"+buildYear);
			   
		}
		else{
			System.out.println("Not enough,need 4 refrences");
		}
		System.out.println("end main palace");
	}
}