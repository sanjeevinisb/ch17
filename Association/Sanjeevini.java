class Sanjeevini
{ 
	String email;
	Clip clip;
	
	Sanjeevini(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
		System.out.println("created Clip using String and Clip");
	}
	public void details()
	{
		this.clip.details();
		System.out.println("Sanjeevini email:"+this.email);
	
	}
}