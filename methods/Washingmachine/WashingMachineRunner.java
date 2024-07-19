class WashingMachine {
	public static void wash()
	{
		
		System.out.println("running wash in WashingMachine");
		shake(); //wash-->shake
		
	}
	public static void shake()
	{
		System.out.println("running shake in WashingMachine");
		alaram(); //shake-->alaram
		
}
public static void alaram()
{
	System.out.println("running alaram in WashingMachine");
	dry(); //alaram-->dry
}
public static void dry()
{
	System.out.println("running dry in WashingMachine");
	rotate(); //dry-->rotate
}
public static void rotate()
{
	System.out.println("running rotate in WashingMachine");
}
}
   
   
   class WashingMachineRunner
   {
	   public static void main(String[] args)
	   {
		   System.out.println("running main in WashingMachine Runner");
		   WashingMachine.wash(); //invoke
		   WashingMachine.shake(); //invoke
		   WashingMachine.alaram(); //invoke
		   WashingMachine.dry(); //invoke
		   WashingMachine.rotate(); //invoke
	   }
   }