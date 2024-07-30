class LampRunner
{
public static void main(String[] args) 
{
	System.out.println("start main in LampRunner");
	
        Lamp lamp = new Lamp("Philips", 60);
		System.out.println("Lamp brand:"+lamp.brand);
		System.out.println("Lamp watts:"+lamp.watts);
        Lamp lamp1 = new Lamp("GE", 75);
		System.out.println("Lamp1 brand:"+lamp1.brand);                    
		System.out.println("Lamp1 watts:"+lamp1.watts);
        Lamp lamp2 = new Lamp("Osram", 100);
		System.out.println("Lamp2 brand:"+lamp2.brand);
		System.out.println("Lamp2 watts:"+lamp2.watts);
        Lamp lamp3 = new Lamp("Sylvania", 40);
		System.out.println("Lamp3 brand:"+lamp3.brand);
		System.out.println("Lamp3 watts:"+lamp3.watts);
        Lamp lamp4 = new Lamp("IKEA", 50);
		System.out.println("Lamp4 brand:"+lamp4.brand);
		System.out.println("Lamp4 watts:"+lamp4.watts);
        Lamp lamp5 = new Lamp("Cree", 85);
		System.out.println("Lamp5 brand:"+lamp5.brand);
		System.out.println("Lamp5 watts:"+lamp5.watts);
        Lamp lamp6 = new Lamp("Energizer", 55);
		System.out.println("Lamp6 brand:"+lamp6.brand);
		System.out.println("Lamp6 watts:"+lamp6.watts);
        Lamp lamp7 = new Lamp("Feit Electric", 65);
		System.out.println("Lamp7 brand:"+lamp7.brand);
		System.out.println("Lamp7 watts:"+lamp7.watts);
        Lamp lamp8 = new Lamp("Westinghouse", 70);
		System.out.println("Lamp8 brand:"+lamp8.brand);
		System.out.println("Lamp8 watts:"+lamp8.watts);
        Lamp lamp9 = new Lamp("TCP", 90);
		System.out.println("Lamp9 brand:"+lamp9.brand);
		System.out.println("Lamp9 watts:"+lamp9.watts);
        Lamp lamp10 = new Lamp("LIFX", 110);
		System.out.println("Lamp10 brand:"+lamp10.brand);
		System.out.println("Lamp10 watts:"+lamp10.watts);

    
    System.out.println("end main in LampRunner");
    }
}