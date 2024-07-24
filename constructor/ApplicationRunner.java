class ApplicationRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in ApplicationRunner");
		Application application=new Application();
		String name=application.name;
		String software=application.software;
		Boolean working=application.working;
		
		System.out.println("application name:"+name);
		System.out.println("application software:"+software);
		System.out.println("application working:"+working);
		System.out.println("========================");
		
		application.name="Instagram";
		application.software="Python";
		application.working=true;
		
		System.out.println("application name updated:"+application.name);
		System.out.println("application software updated:"+application.software);
		System.out.println("application working updated:"+application.working);
		
		System.out.println("end main in FruitRunner");
	}
}