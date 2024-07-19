class ChainRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in ChainRunner");
		int value=Chain.carat();
		System.out.println("carat return type:"+value);
		double price=Chain.costPerGram();
		System.out.println("costPerGram return type:"+price);
		String ref=Chain.type();
		System.out.println("type returntype:"+ref);
		String alloy=Chain.quality();
		System.out.println("quality returntype:"+alloy);
		int no=Chain.quantity();
        System.out.println("quantity return type:"+no);		
		float remain=Chain.wastage();
		System.out.println("wastage return type:"+remain);
		float pay=Chain.serviceCharge();
		System.out.println("serviceCharge return type:"+pay);
		float percentage=Chain.GST();
		System.out.println("GST return type:"+percentage);
	}
}
		                                  