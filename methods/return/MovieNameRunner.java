class MovieNameRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in MovieNameRunner");
		
		String movieName="Chhichhore";
		String producerName=MovieName.producerName(movieName);
		System.out.println("ProducerName:"+producerName);
		String movieName1="Eega";
		String producerName1=MovieName.producerName(movieName1);
		System.out.println("ProducerName:"+producerName1);
		String movieName2="Manikarnika";
		String producerName2=MovieName.producerName(movieName2);
		System.out.println("ProducerName:"+producerName2);
		String movieName3="Amruthavarshini";
		String producerName3=MovieName.producerName(movieName3);
		System.out.println("ProducerName:"+producerName3);
		String movieName4="Thalavi";
		String producerName4=MovieName.producerName(movieName4);
		System.out.println("ProducerName:"+producerName4);
		String movieName5="Kalki";
		String producerName5=MovieName.producerName(movieName5);
		System.out.println("ProducerName:"+producerName5);
	}
	
	
}