class KeyBunch
{ 
	String material;
	Key key;
	
	KeyBunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
		System.out.println("created Key using String and Key");
	}
	public void display()
	{
		this.key.display();
		System.out.println("KeyBunch material:"+this.material);
	
	}
}