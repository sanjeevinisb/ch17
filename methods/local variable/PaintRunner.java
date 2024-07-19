class PaintRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in paintRunner");
		Paint.material("Asian");
		Paint.mixture("Dulux","pink");
		Paint.solid("Berger",1500);
		Paint.ingredients("red","matt finish",2500);
	}
}