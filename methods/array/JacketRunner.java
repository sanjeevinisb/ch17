class JacketRunner
{
	public static void main(String[] person)
	{
		System.out.println("start in first main person");
		
		if(person.length==4)
		{
			System.out.println("Getting 4 refrences from main method");
		
		String name=person[0];
		String email=person[1];
		String age=person[2];
        String password=person[3];
		
		   System.out.println("Name:"+name);
		   System.out.println("Email:"+email);
		   System.out.println("Age:"+age);
		   System.out.println("Password:"+password);
			   
		}
		else{
			System.out.println("Not enough,need 4 refrences");
		}
		System.out.println("end in first main person");
	}
	
	
	
	
	
}

