class SymptomRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in SymptomRunner");
		String symptom="Fever";
		String medicineName=Symptom.medicineName(symptom);
		System.out.println("MedicineName:"+medicineName);
		String symptom1="BodyPain";
		String medicineName1=Symptom.medicineName(symptom1);
		System.out.println("MedicineName:"+medicineName1);
		String symptom2="HeadAche";
		String medicineName2=Symptom.medicineName(symptom2);
		System.out.println("MedicineName:"+medicineName2);
		String symptom3="Dengue";
		String medicineName3=Symptom.medicineName(symptom3);
		System.out.println("MedicineName:"+medicineName3);
	}
}