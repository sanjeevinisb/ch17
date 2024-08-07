class Knife
{
	double weight;
	double height;
	
	public Knife(double weight,double height)
	{
		System.out.println("Created a Knife using two double arguments");
		this.weight=weight;
		this.height=height;
	}
	
	public void details()
	{
		System.out.println("Knife weight:"+weight);
		System.out.println("Knife height:"+height);
	}
	
		
}
		