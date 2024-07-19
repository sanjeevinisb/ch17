class WashingMachine {
	public static void wash()
	{
		
		System.out.println("running wash in WashingMachine");
		
	}
	public static void shake()
	{
		System.out.println("running shake in WashingMachine");
		
}
public static void alaram()
{
	System.out.println("running alaram in WashingMachine");
}
public static void dry()
{
	System.out.println("running dry in WashingMachine");
}
public static void rotate()
{
	System.out.println("running rotate in WashingMachine");
}
}
   
   
   class WashingMachine Runner
   {
	   public static void main(String[] args)
	   {
		   System.out.println("running main in WashingMachine Runner"):
		   WashingMachine.wash(); //invoke
		   WashingMachine.shake(); //invoke
		   WashingMachine.alaram(); //invoke
		   WashingMachine.dry(); //invoke
		   WashingMachine.rotate(); //invoke
	   }
   }