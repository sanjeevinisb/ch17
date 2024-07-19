class DoctorRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting DoctorRunner");
		String doctorName="Dr.Ankit Bhojani";
		String returnAvailability=Doctor.returnAvailability(doctorName);
		System.out.println("ReturnAvailability:"+returnAvailability);
		String doctorName1="Dr.H.S.Mrutyunjaya";
		String returnAvailability1=Doctor.returnAvailability(doctorName1);
		System.out.println("ReturnAvailability:"+returnAvailability1);
		String doctorName2="Dr.Ashwath Narayan";
		String returnAvailability2=Doctor.returnAvailability(doctorName2);
		System.out.println("ReturnAvailability:"+returnAvailability2);
		
	}
}