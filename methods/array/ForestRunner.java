class ForestRunner
{
	public static void main(String[] forest)
	{
		System.out.println("start main forest");
		
		if(forest.length==4)
		{
			System.out.println("Getting 4 refrences from main method");
		
		String name=forest[0];
		String area=forest[1];
		String establishedYear=forest[2];
        String state=forest[3];
		
		   System.out.println("Name:"+name);
		   System.out.println("Area:"+area);
		   System.out.println("EstablishedYear:"+establishedYear);
		   System.out.println("State:"+state);
			   
		}
		else{
			System.out.println("Not enough,need 4 refrences");
		}
		System.out.println("end main forest");
	}
}