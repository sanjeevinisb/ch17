class CeramicItemsRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting getPrice");
		String item="Pot";
		double price=CeramicItems.getPrice(item);
		String item1="TeaCup";
		double price1=CeramicItems.getPrice(item);
		System.out.println("Price:" +price1);
		String item2="Kettle";
		double price2=CeramicItems.getPrice(item);
		System.out.println("Price:" +price2);
		String item3="Plate";
		double price3=CeramicItems.getPrice(item);
		System.out.println("Price:" +price3);
		String item4="Bowl";
		double price4=CeramicItems.getPrice(item);
		System.out.println("Price:" +price4);
	}
}
		