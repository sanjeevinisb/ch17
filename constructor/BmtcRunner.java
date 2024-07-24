class BmtcRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in BmtcRunner");
		Bmtc bmtc=new Bmtc();
		int ref=bmtc.charge;
		System.out.println("bmtc charge:"+ref);
		String ref2=bmtc.busStation;
		System.out.println("bmtc busStation:"+ref2);
		int ref3=bmtc.depots;
		System.out.println("bmtc depots:"+ref3);
		System.out.println("end main in BmtcRunner");
	}
}