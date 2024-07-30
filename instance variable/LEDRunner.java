class LEDRunner
{
public static void main(String[] args) 
{
	System.out.println("start main in LEDRunner");
	
        LED led = new LED("red", 100, "small");
		System.out.println("LED color:"+led.color);
		System.out.println("LED brightness:"+led.brightness);
		System.out.println("LED size:"+led.size);
	    LED led1 = new LED("blue", 80, "medium");
		System.out.println("LED1 color:"+led1.color);
		System.out.println("LED1 brightness:"+led1.brightness);
		System.out.println("LED1 size:"+led1.size);
		LED led2 = new LED("green", 90, "large");
		System.out.println("LED2 color:"+led2.color);
		System.out.println("LED2 brightness:"+led2.brightness);
		System.out.println("LED2 size:"+led2.size);
		LED led3 = new LED("yellow", 95, "medium");
		System.out.println("LED3 color:"+led3.color);
		System.out.println("LED3 brightness:"+led3.brightness);
		System.out.println("LED3 size:"+led3.size);
		LED led4 = new LED("white", 70, "small");
		System.out.println("LED4 color:"+led4.color);
		System.out.println("LED4 brightness:"+led4.brightness);
		System.out.println("LED4 size:"+led4.size);
		LED led5 = new LED("purple", 85, "large");
		System.out.println("LED5 color:"+led5.color);
		System.out.println("LED5 brightness:"+led5.brightness);
		System.out.println("LED5 size:"+led5.size);
		LED led6 = new LED("orange", 75, "medium");
		System.out.println("LED6 color:"+led6.color);
		System.out.println("LED6 brightness:"+led6.brightness);
		System.out.println("LED6 size:"+led6.size);
		LED led7 = new LED("cyan", 88, "small");
		System.out.println("LED7 color:"+led7.color);
		System.out.println("LED7 brightness:"+led7.brightness);
		System.out.println("LED7 size:"+led7.size);
		LED led8 = new LED("magenta", 92, "large");
		System.out.println("LED8 color:"+led8.color);
		System.out.println("LED8 brightness:"+led8.brightness);
		System.out.println("LED8 size:"+led8.size);
		LED led9 = new LED("amber", 82, "medium");
		System.out.println("LED9 color:"+led9.color);
		System.out.println("LED9 brightness:"+led9.brightness);
		System.out.println("LED9 size:"+led9.size);
		LED led10 = new LED("teal", 78, "small");
		System.out.println("LED10 color:"+led10.color);
		System.out.println("LED10 color:"+led10.brightness);
		System.out.println("LED10 size:"+led10.size);
		
		System.out.println("end main in LEDRunner");
}
}