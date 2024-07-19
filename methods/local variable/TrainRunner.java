class TrainRunner
{
	public static void main(String[] args)
	{
		Train.book("Dharwad","Banglore");
		Train.book("Dharwad","Banglore",2);
		Train.book("Dharwad","Banglore",3,134.82);
		Train.cancel(4);
		Train.cancel("Dharwad","Banglore");
	}
}
		 