class AutoDriverRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in AutoDriverRunner");
		AutoDriver autoDriver=new AutoDriver();
		String ref=autoDriver.name;
		System.out.println("autoDriver name:"+ref);
		int ref1=autoDriver.age;
		System.out.println("autoDriver age:"+ref1);
		int ref2=autoDriver.charge;
		System.out.println("autoDriver charge:"+ref2);
		System.out.println("end main in AutoDriverRunner");
	}
}