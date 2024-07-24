class RupeeRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in RupeeRunner");
		Rupee rupee=new Rupee();
		String ref=rupee.shape;
		System.out.println("rupee shape:"+ref);
		String ref1=rupee.material;
		System.out.println("rupee material:"+ref1);
		int ref2=rupee.value;
		System.out.println("rupee value:"+ref2);
		System.out.println("end main in RupeeRunner");
	}
}