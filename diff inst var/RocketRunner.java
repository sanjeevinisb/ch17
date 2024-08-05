class RocketRunner
{
public static void main(String[] args)
{
	Rocket rocket=new Rocket(2800);
	rocket.setNoOfThrusters(1.5f);
	rocket.fuelCapacity=500;
	rocket.display();
}
}
	