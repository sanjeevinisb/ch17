class SoftwareEngineer
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEngineer()
	{
		System.out.println("created SoftwareEngineer using no argument constructor");
	}
	SoftwareEngineer(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		System.out.println("created SoftwareEngineer using String name,int experience,String designation,double salary");
	}
	public void print()
	{
		System.out.println("SoftwareEngineer name:"+this.name);
		System.out.println("SoftwareEngineer experience:"+this.experience);
		System.out.println("SoftwareEngineer designation:"+this.designation);
		System.out.println("SoftwareEngineer salary:"+this.salary);
		
	}
}
class Company
{
	int id=26;
    String name="SLN";
	String location="Electronic city";
    SoftwareEngineer softwareEngineer=new SoftwareEngineer("Kiran",2,"CTO",270000);
    Company()
{
	System.out.println("created Company using no arguments constructor");
}
public void print()
{
    System.out.println("id:"+this.id);
    System.out.println("name:"+this.name);
    System.out.println("location:"+this.location);
	System.out.println("SoftwareEngineer name:"+this.softwareEngineer.name);
	System.out.println("SoftwareEngineer experience:"+this.softwareEngineer.experience);
	System.out.println("SoftwareEngineer designation:"+this.softwareEngineer.designation);
	System.out.println("SoftwareEngineer salary:"+this.softwareEngineer.salary);
	
}
}