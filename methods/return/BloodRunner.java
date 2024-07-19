class BloodRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BloodRunner");
		char value=Blood.group();
		System.out.println("group return type:"+value);
		String name=Blood.personName();
		System.out.println("personName return type:"+name);
		double price=Blood.cost();
		System.out.println("cost returntype:"+price);
		int no=Blood.hospitalTested();
        System.out.println("hospitalTested return type:"+no);		
		boolean ref=Blood.sickness();
		System.out.println("sickness return type:"+ref);
		boolean reference=Blood.donate();
		System.out.println("donate return type:"+reference);
	}
}
		                                                 