class Projector
{
     String company="Zebronics";
	 String color;
     String types;
	 float weight;
	 public Projector(float weight)
	 {
		 this.weight=weight;
	 }
	 public void setTypes(String types)
	 {
		 this.types=types;
	 }
	 public void display()
	 {
		 System.out.println("company:"+this.company);
		 System.out.println("color:"+this.color);
		 System.out.println("types:"+this.types);
		 System.out.println("weight:"+this.weight);
	 }
 }


		 
		 