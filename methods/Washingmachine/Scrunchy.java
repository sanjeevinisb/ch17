class Scrunchy 
{
public static void main(String[] args)
{
stretch(); //invoke 	
}
static void stretch()
{
	System.out.println("stretch performs elasticity property ");
	tie(); //invoke
}
static void tie()
{
	System.out.println("tie used in scrunchy to hold hair");
	stretch(); //invoke
}
}

