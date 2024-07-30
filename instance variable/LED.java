class LED
{
	String color;
	int brightness;
	String size;
	
	LED(String colorLocal,int brightnessLocal,String sizeLocal)
	{
		color=colorLocal;
		brightness=brightnessLocal;
		size=sizeLocal;
		System.out.println("Created LED using color,brightness,size");
	}
	
}
