class State
{
String name="Karnataka";
String language;
CapitalCity capitalCity=new CapitalCity("Banglore",12102000L);
public State(String language)
{
	this.language=language;
}
public void print()
{

    System.out.println("State name:"+name);
    System.out.println("State language:"+language);
	capitalCity.print();
	
}
}