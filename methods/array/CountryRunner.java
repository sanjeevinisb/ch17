 class CountryRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in CountryRunner");
		String[] statecount={"AndraPradesh","ArunachalPradesh","Assam","Bihar","Chattisgarh","Goa","Gujarat","Haryana",
		"HimachalPradesh","Jharkhand","Karnataka","Kerala","MadhyaPradesh","Maharashtra","Manipur","Meghalaya","Mizoram",
		"Nagaland","Odisha","Punjab","Rajasthan","Sikkim","TamilNadu","Telangana","Tripura","UttaraKhand","UttarPradesh",
		"WestBengal","JammuAndKashmir"};
		Country.states(statecount);
		System.out.println("===========");
		Country.statebackward(statecount);
		
		
		
		int[] karnatakacode={562162,530068,560001,560002,583231,581110,583201,581106,570078,562157};
		Country.pincode(karnatakacode);
		System.out.println("===========");
		Country.pincodebackward(karnatakacode);
		
		
		
		String[] ministerCount={"Jawahar Lal Nehru","Gulzarilal Nanda","LalBahadur Shastri","Indira Gandhi","Morarji Desai","CharanSingh","RajivGandhi","V.P.Singh","Chandra Shekar","P.V.Narasimha Rao",
		"Atal Bihari Vajpayee","H.D.Deve Gowda","Inder Kumar Gujral","Manmohan Singh","Narendra Modi"};
		Country.primeMinister(ministerCount);
		System.out.println("===========");
		Country.primebackward(ministerCount);
		
		
		
		String[] cabinetcount={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin Jairam Gadkari","Smt. Nirmala Sitharaman",	
        "Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri H. D. Kumaraswamy",	
        "Shri Piyush Goyal","Shri Dharmendra Pradhan","Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh alias Lalan Singh","Shri Sarbananda Sonowal",	
        "Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi","Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw",
        "Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi","Shri Kiren Rijiju",	
        "Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		Country.cabinetMinisters(cabinetcount);
		System.out.println("===========");
		Country.cabinetbackward(cabinetcount);
		
		
		
		String[] partiescount={"Bharatiya Janata Party","Indian National Congress","Janata Dal","Bahujan Samaj Party","National People's Party"};
		Country.politicalParties(partiescount);
		System.out.println("===========");
		Country.politicalbackward(partiescount);
	}
}
 class Jacket
{
	public static void main(String[] person)
	{
		System.out.println("start in first main person");
		
		if(person.length==4)
		{
			System.out.println("Getting 4 refrences from main method");
		
		String name=person[0];
		String email=person[1];
		String age=person[2];
        String password=person[3];
		
		   System.out.println("Name:"+name);
		   System.out.println("Email:"+email);
		   System.out.println("Age:"+age);
		   System.out.println("Password:"+password);
			   
		}
		else{
			System.out.println("Not enough,need 4 refrences");
		}
		System.out.println("end in first main person");
	}
	
}
 class ForestRunner
{
	public static void main(String[] forest)
	{
		System.out.println("start main forest");
		
		if(forest.length==4)
		{
			System.out.println("Getting 4 refrences from main method");
		
		String name=forest[0];
		String area=forest[1];
		String establishedYear=forest[2];
        String state=forest[3];
		
		   System.out.println("Name:"+name);
		   System.out.println("Area:"+area);
		   System.out.println("EstablishedYear:"+establishedYear);
		   System.out.println("State:"+state);
			   
		}
		else{
			System.out.println("Not enough,need 4 refrences");
		}
		System.out.println("end main forest");
	}
}
 class PalaceRunner
{
	public static void main(String[] palace)
	{
		System.out.println("start main palace");
		
		if(palace.length==4)
		{
			System.out.println("Getting 4 refrences from main method");
		
		String name=palace[0];
		String location=palace[1];
		String builtBy=palace[2];
        String buildYear=palace[3];
		
		   System.out.println("Name:"+name);
		   System.out.println("Location:"+location);
		   System.out.println("BulitBy:"+builtBy);
		   System.out.println("BuildYear:"+buildYear);
			   
		}
		else{
			System.out.println("Not enough,need 4 refrences");
		}
		System.out.println("end main palace");
	}
}