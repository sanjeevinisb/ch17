class Owner
{
	String name;
	int age;
	char gender;
	
	Owner()
	{
		System.out.println("created Owner using no argument constructor");
	}
	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("created Owner using String name,int age,char gender");
	}
	public void print()
	{
		System.out.println("Owner name:"+this.name);
		System.out.println("Owner age:"+this.age);
		System.out.println("Owner gender:"+this.gender);
	}
}
class Hotel
{
String name="The President";
Owner owner=new Owner("Vijay",48,'M');
Hotel()
{
	System.out.println("created Hotel using no arguments constructor");
}
public void print()
{
	this.owner.print();
}
}