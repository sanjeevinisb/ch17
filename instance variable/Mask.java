 class Mask
{
	double cost;
	char size;
	String material;
	
	Mask()
	{
		System.out.println("creating mask with no parameter");
		System.out.println("Cost:"+cost);
		System.out.println("Size:"+size);
		System.out.println("Material:"+material);
		
		this.cost=cost;
		this.size=size; 
		this.material=material;
	}
	
	Mask(double cost)
	{
		System.out.println("creating mask using double");
		System.out.println("Cost:"+cost);
		System.out.println("Size:"+size);
		System.out.println("Material:"+material);
		
		this.cost=cost;
		this.size=size;
		this.material=material;
		
		
		System.out.println("Cost updated:"+cost);
		System.out.println("Size updated:"+size);
		System.out.println("Material updated:"+material);
		
		
	}
	
	Mask(char size)
	{
		System.out.println("creating mask using char");
		System.out.println("Cost:"+cost);
		System.out.println("Size:"+size);
		System.out.println("Material:"+material);
		
		this.cost=cost;
		this.size=size;
		this.material=material;
		
		
		System.out.println("Cost updated:"+cost);
		System.out.println("Size updated:"+size);
		System.out.println("Material updated:"+material);
		
	}
	
	Mask(String material)
	{
		System.out.println("creating mask using string");
		System.out.println("Cost:"+cost);
		System.out.println("Size:"+size);
		System.out.println("Material:"+material);
		
		this.cost=cost;
		this.size=size;
		this.material=material;
		
		
		System.out.println("Cost updated:"+cost);
		System.out.println("Size updated:"+size);
		System.out.println("Material updated:"+material);
	}
	
	Mask(double cost,char size,String material)
	{
		System.out.println("creating mask using double,char,string");
		System.out.println("Cost:"+cost);
		System.out.println("Size:"+size);
		System.out.println("Material:"+material);
		
		this.cost=cost;
		this.size=size;
		this.material=material;
		
		
		System.out.println("Cost updated:"+cost);
		System.out.println("Size updated:"+size);
		System.out.println("Material updated:"+material);
	}
	
	Mask(double cost,char size)
	{
		System.out.println("creating mask using double,char");
		System.out.println("Cost:"+cost);
		System.out.println("Size:"+size);
		System.out.println("Material:"+material);
		
		this.cost=cost;
		this.size=size;
		this.material=material;
		
		
		System.out.println("Cost updated:"+cost);
		System.out.println("Size updated:"+size);
		System.out.println("Material updated:"+material);
	}
}
 
 

 
 