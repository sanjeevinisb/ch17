class CabCompanyRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in CabCompanyRunner");
		 CabCompany cabCompany=new CabCompany();
		float ref=cabCompany.charge;
		System.out.println("cabCompany charge:"+ref);
		String ref2=cabCompany.vehicleType;
		System.out.println("cabCompany vehicleType:"+ref2);
		String ref3=cabCompany.vehicleModel;
		System.out.println("cabCompany vehicleModel:"+ref3);
		System.out.println("end main in CabCompanyRunner");
	}
}