class LensRunner
{
public static void main(String[] args) 
{
	System.out.println("start main in LensRunner");
	
        Lens lens = new Lens("Canon",50);
		System.out.println("Lens brand:"+lens.brand);
		System.out.println("Lens focalLength:"+lens.focalLength);
		Lens lens1 = new Lens("Nikon",50);
		System.out.println("Lens1 brand:"+lens1.brand);
		System.out.println("Lens1 focalLength:"+lens1.focalLength);
		Lens lens2 = new Lens("Sony",50);
		System.out.println("Lens2 brand:"+lens2.brand);
		System.out.println("Lens2 focalLength:"+lens2.focalLength);
		Lens lens3 = new Lens("Sigma",50);
		System.out.println("Lens3 brand:"+lens3.brand);
		System.out.println("Lens3 focalLength:"+lens3.focalLength);
		Lens lens4 = new Lens("Tamron",45);
		System.out.println("Lens4 brand:"+lens4.brand);
		System.out.println("Lens4 focalLength:"+lens4.focalLength);
		Lens lens5 = new Lens("Canon",85);
		System.out.println("Lens5 brand:"+lens5.brand);
		System.out.println("Lens5 focalLength:"+lens5.focalLength);
		Lens lens6 = new Lens("Nikon",85);
		System.out.println("Lens6 brand:"+lens6.brand);
		System.out.println("Lens6 focalLength:"+lens6.focalLength);
		Lens lens7 = new Lens("Sony",85);
		System.out.println("Lens7 brand:"+lens7.brand);
		System.out.println("Lens7 focalLength:"+lens7.focalLength);
		Lens lens8 = new Lens("Sigma", 85);
		System.out.println("Lens8 brand:"+lens8.brand);
		System.out.println("Lens8 focalLength:"+lens8.focalLength);
		Lens lens9 = new Lens("Tamron",85);
		System.out.println("Lens9 brand:"+lens9.brand);
		System.out.println("Lens9 focalLength:"+lens9.focalLength);
		Lens lens10 = new Lens("Canon",100);
		System.out.println("Lens10 brand:"+lens10.brand);
		System.out.println("Lens10 focalLength:"+lens10.focalLength);
		
		System.out.println("end main in LensRunner");
}
}