class AirConditionRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in AirConditionRunner");
		AirCondition airCondition=new AirCondition();
		String ref=airCondition.brand;
		System.out.println("airCondition brand:"+ref);
		double ref1=airCondition.temperature;
		System.out.println("airCondition temperature:"+ref1);
		double ref2=airCondition.price;
		System.out.println("airCondition price:"+ref2);
		System.out.println("end main in AirConditionRunner");
	}
}