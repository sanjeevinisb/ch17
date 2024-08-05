class Rocket
{
	 String country="India";
	 int speed;
	 double fuelCapacity=500;
	 float noOfThrusters;
	 public Rocket(int speed)
	 {
		 this.speed=speed;
	 }
	 public void setNoOfThrusters(float noOfThrusters)
	 {
		 this.noOfThrusters=noOfThrusters;
	 }
	 public void display()
	 {
		 System.out.println("country:"+this.country);
		 System.out.println("speed:"+this.speed);
		 System.out.println("fuelCapacity:"+this.fuelCapacity);
		 System.out.println("noOfThrusters:"+this.noOfThrusters);
	 }
 }