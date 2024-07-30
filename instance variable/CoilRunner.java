class CoilRunner
{
public static void main(String[] args) 
{
	System.out.println("start main in CoilRunner");
	
        Coil coil = new Coil("Solenoid", 5.0);
		System.out.println("Coil type:"+coil.type);
		System.out.println("Coil diameter:"+coil.diameter);
        Coil coil1 = new Coil("Ignition", 7.5);
		System.out.println("Coil1 type:"+coil1.type);                    
		System.out.println("Coil1 diameter:"+coil1.diameter);
        Coil coil2 = new Coil("Voice", 3.2);
		System.out.println("Coil2 type:"+coil2.type);
		System.out.println("Coil2 diameter:"+coil2.diameter);
        Coil coil3 = new Coil("Tesla", 20.0);
		System.out.println("Coil3 type:"+coil3.type);
		System.out.println("Coil3 diameter:"+coil3.diameter);
        Coil coil4 = new Coil("Induction", 10.0);
		System.out.println("Coil4 type:"+coil4.type);
		System.out.println("Coil4 diameter:"+coil4.diameter);
        Coil coil5 = new Coil("Transformer", 15.0);
		System.out.println("Coil5 type:"+coil5.type);
		System.out.println("Coil5 diameter:"+coil5.diameter);
        Coil coil6 = new Coil("Pancake", 8.0);
		System.out.println("Coil6 type:"+coil6.type);
		System.out.println("Coil6 diameter:"+coil6.diameter);
        Coil coil7 = new Coil("Pickup", 5.5);
		System.out.println("Coil7 type:"+coil7.type);
		System.out.println("Coil7 diameter:"+coil7.diameter);
        Coil coil8 = new Coil("Magnetic", 12.0);
		System.out.println("Coil8 type:"+coil8.type);
		System.out.println("Coil8 diameter:"+coil8.diameter);
        Coil coil9 = new Coil("Toroidal", 6.5);
		System.out.println("Coil9 type:"+coil9.type);
		System.out.println("Coil9 diameter:"+coil9.diameter);
        Coil coil10 = new Coil("Helical", 4.0);
		System.out.println("Coil10 type:"+coil10.type);
		System.out.println("Coil10 diameter:"+coil10.diameter);

    
    System.out.println("end main in CoilRunner");
    }
}