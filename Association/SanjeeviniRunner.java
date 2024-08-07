class SanjeeviniRunner
{
public static void main(String[] args)
{
    Clip clip=new Clip("Lavender","claw clip");

	Sanjeevini sanjeevini=new Sanjeevini("sanjeevini@gmail.com",clip);
	sanjeevini.details();
	
	Clip clip1=new Clip("Crimson","Bobby pins");
	 
	Sanjeevini sanjeevini1=new Sanjeevini("ssg@gmail.com",clip1);
	sanjeevini1.details();
	 
	Clip clip2=new Clip("Orchid","Banana clip");
	 
	Sanjeevini sanjeevini2=new Sanjeevini("sanju@gmail.com",clip2);
	sanjeevini2.details();
}
}