class SimCard
{
	long number;
	String carrier;
	int dataPlan;
	
	SimCard(long numberLocal,String carrierLocal,int dataPlanLocal)
	{
		number=numberLocal;
		carrier=carrierLocal;
		dataPlan=dataPlanLocal;
		System.out.println("Created SimCard using number,carrier,dataPlan");
	}
	
}
