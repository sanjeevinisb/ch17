class Symptom
{
	public static String medicineName(String symptom)
	{
		System.out.println("find out there symptom");
		System.out.println("Symptom:"+symptom);
		
		if(symptom=="Fever")
		{
			return"dolo650";
		}
		if(symptom=="BodyPain")
		{
			return"aspirin";
		}
		if(symptom=="HeadAche")
		{
			return"anacin";
		}
		
		System.out.println("Tablet Not Found");
		return"No matching Tablet Found";
	}
}