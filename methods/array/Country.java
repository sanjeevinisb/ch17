 class Country
{
	public static void states(String[] states)
	{
		System.out.println("running states in country");
		for(int count=0;count<states.length;count++)
		{
			String ref=states[count];
			System.out.println("states:"+ref);
		}
		
	}
	public static void statebackward(String[] states)
	{
		System.out.println("running statebackward in country");
		for(int index=states.length-1;index>=0;index--)
		{
			System.out.println(states[index]);
		}
	}
	
	
	public static void pincode(int[] pincode)
	{
		System.out.println("running pincode in country");
		
		for(int no=0;no<pincode.length;no++)
		{
			int ref=pincode[no];
			System.out.println("pincode:"+ref);
		}
	}
	public static void pincodebackward(int[] pincode)
	{
		System.out.println("running pincode in pincodebackward");
		   
		for(int index=pincode.length-1;index>=0;index--)
		{
			   System.out.println(pincode[index]);
	    }
	}
	
	
	public static void primeMinister(String[] primeMinister)
	{
		System.out.println("running primeMinister in country");
		
		for(int count=0;count<primeMinister.length;count++)
		{
			String ref=primeMinister[count];
			System.out.println("primeMinister:"+ref);
		}
	}
	public static void primebackward(String[] primeMinister)
	{
		System.out.println("running primeMinister in primebackward");
		   
		for(int index=primeMinister.length-1;index>=0;index--)
		{
			   System.out.println(primeMinister[index]);
	    }
	}
	
	
	public static void cabinetMinisters(String[] cabinetMinisters)
	{
		System.out.println("running cabinetMinisters in country");
		
		for(int position=0;position<cabinetMinisters.length;position++)
		{
			String ref=cabinetMinisters[position];
			System.out.println("cabinetMinisters:"+ref);
		}
	}
	public static void cabinetbackward(String[] cabinetMinisters)
	{
		System.out.println("running cabinetMinisters in cabinetbackward");
		   
		for(int index=cabinetMinisters.length-1;index>=0;index--)
		{
			   System.out.println(cabinetMinisters[index]);
	    }
	}
	
	public static void politicalParties(String[] politicalParties)
	{
		System.out.println("running politicalParties in country");
		
		for(int no=0;no<politicalParties.length;no++)
		{
			String ref=politicalParties[no];
			System.out.println("politicalParties:"+ref);
		}
	}
	public static void politicalbackward(String[] politicalParties)
	{
		System.out.println("running politicalParties in politicalbackward");
		   
		for(int index=politicalParties.length-1;index>=0;index--)
		{
			   System.out.println(politicalParties[index]);
	    }
	}
	
	
	
}
 