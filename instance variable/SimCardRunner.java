class SimCardRunner
{
public static void main(String[] args) 
{
	System.out.println("start main in SimCardRunner");
	
        SimCard simCard = new SimCard(7795876788L, "Carrier A", 5);
		System.out.println("SimCard number:"+simCard.number);
		System.out.println("SimCard carrier:"+simCard.carrier);
		System.out.println("SimCard dataPlan:"+simCard.dataPlan);
		SimCard simCard1 = new SimCard( 2345678901L, "Carrier B", 10);
		System.out.println("SimCard1 number:"+simCard1.number);
		System.out.println("SimCard1 carrier:"+simCard1.carrier);
		System.out.println("SimCard1 dataPlan:"+simCard1.dataPlan);
		SimCard simCard2 = new SimCard( 3456789012L, "Carrier C", 25);
		System.out.println("SimCard2 number:"+simCard2.number);
		System.out.println("SimCard2 carrier:"+simCard2.carrier);
		System.out.println("SimCard2 dataPlan:"+simCard2.dataPlan);
		SimCard simCard3 = new SimCard(4567890123L, "Carrier A", 2);
		System.out.println("SimCard3 number:"+simCard3.number);
		System.out.println("SimCard3 carrier:"+simCard3.carrier);
		System.out.println("SimCard3 dataPlan:"+simCard3.dataPlan);
		SimCard simCard4 = new SimCard(5678901234L, "Carrier B", 15);
		System.out.println("SimCard4 number:"+simCard4.number);
		System.out.println("SimCard4 carrier:"+simCard4.carrier);
		System.out.println("SimCard4 dataPlan:"+simCard4.dataPlan);
		SimCard simCard5 = new SimCard(6789012345L, "Carrier C", 5);
		System.out.println("SimCard5 number:"+simCard5.number);
		System.out.println("SimCard5 carrier:"+simCard5.carrier);
		System.out.println("SimCard5 dataPlan:"+simCard5.dataPlan);
		SimCard simCard6 = new SimCard(7890123456L, "Carrier A", 10);
		System.out.println("SimCard6 number:"+simCard6.number);
		System.out.println("SimCard6 carrier:"+simCard6.carrier);
		System.out.println("SimCard6 dataPlan:"+simCard6.dataPlan);
		SimCard simCard7 = new SimCard( 8901234567L, "Carrier B", 2);
		System.out.println("SimCard7 number:"+simCard7.number);
		System.out.println("SimCard7 carrier:"+simCard7.carrier);
		System.out.println("SimCard7 dataPlan:"+simCard7.dataPlan);
		SimCard simCard8 = new SimCard(9012345678L, "Carrier C", 2);
		System.out.println("SimCard8 number:"+simCard8.number);
		System.out.println("SimCard8 carrier:"+simCard8.carrier);
		System.out.println("SimCard8 dataPlan:"+simCard8.dataPlan); 
		SimCard simCard9 = new SimCard(9123456789L, "Carrier A", 5);
		System.out.println("SimCard9 number:"+simCard9.number);
		System.out.println("SimCard9 carrier:"+simCard9.carrier);
		System.out.println("SimCard9 dataPlan:"+simCard9.dataPlan);
		SimCard simCard10 = new SimCard( 9876543210L, "Carrier B", 10);
		System.out.println("SimCard10 number:"+simCard10.number);
		System.out.println("SimCard10 carrier:"+simCard10.carrier);
		System.out.println("SimCard10 dataPlan:"+simCard10.dataPlan);
		
		System.out.println("end main in SimCardRunner");
}
}
		