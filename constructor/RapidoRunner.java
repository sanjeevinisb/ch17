class RapidoRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in RapidoRunner");
		Rapido rapido=new Rapido();
		int ref=rapido.charge;
		System.out.println("rapido charge:"+ref);
		String ref1=rapido.city;
		System.out.println("rapido city:"+ref1);
		long ref2=rapido.contactNo;
		System.out.println("rapido contactNo:"+ref2);
		System.out.println("end main in RapidoRunner");
	}
}