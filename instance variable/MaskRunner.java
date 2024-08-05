class MaskRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in MaskRunner");
		new Mask();
		Mask mask=new Mask(10);
		Mask mask1=new Mask('M');
		Mask mask2=new Mask("spunbond");
		Mask mask3=new Mask(25,'S',"meltblown");
		Mask mask4=new Mask(15,'L');
		System.out.println("end main in MaskRunner");
		
	}
}