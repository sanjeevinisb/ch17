class BuyRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BuyRunner");
		Buy.product("Bajaj",60);
		Buy.product("Bajaj",150);
		Buy.product("Coconut",100,"high",250);
		Buy.product("Coconut",300,"high",350);
		System.out.println("running buy main in BuyRunner");
        Buy.bookMovieTicket("Kalki","Sujata",155,150);
		System.out.println("running buyEgg in buy parameters");
		Buy.buyEgg(30,200); 
		System.out.println("running buyShampoo in buy parameters");
		Buy.buyShampoo(100,250,"nyle","fourOfJuly");
		Buy.buyShampoo(250,250,"nyle","fourOfJuly");
		System.out.println("running buyCake in buy parameters");
		Buy.buyCake('M',"Round","chocolate",280,6);
		Buy.buySmartWatch("FireBolt",5000,255,'R',8);
		Buy.buySmartWatch("FireBolt",5000,255,'R',15);
		Buy.buyLaptop("HP",23564,50000,4400,15,"windows ten",500,4);
		Buy.buyLaptop("HP",23564,50000,4400,18,"windows ten",500,4);
		
		}
		}
		
	
