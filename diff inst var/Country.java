class Country
{
	String name;
	String continent;
    State state =new State("kannada");
	public Country(String name,String continent)
	{
	   this.name=name;
	   this.continent=continent;
	}
	public void print()
	{
	    
		System.out.println("Country name:"+name);
	    System.out.println("Country:"+continent);
        state.print();

	}
}
