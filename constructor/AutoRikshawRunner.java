 class AutoRikshawRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in AutoRikshawRunner");
		AutoRikshaw autoRikshaw=new AutoRikshaw();
		String ref=autoRikshaw.company;
		System.out.println("autoRikshaw company:"+ref);
		double ref1=autoRikshaw.price;
		System.out.println("autoRikshaw price:"+ref1);
		String ref2=autoRikshaw.material;
		System.out.println("autoRikshaw material:"+ref2);
		System.out.println("end main in AutoRikshawRunner");
	}
}