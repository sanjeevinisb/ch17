class ChargerRunner
{
	public static void main(String[] args)
	{
		System.out.println("start charging the phone");
		Charger charger=new Charger();
		charger.company="oneplus";
		charger.type='C';
		
		System.out.println("updated charger company:"+charger.company);
		System.out.println("updated charger type:"+charger.type);
		System.out.println("updated charger wattages:"+charger.wattages);
		System.out.println("end charging the phone");
		
	
	    System.out.println("=================================================");
	
	
		System.out.println("start holding through claw");
		Claw claw=new Claw();
		claw.claws=4;
		claw.holdPrey=true;
		
		System.out.println("updated claws:"+claw.claws);
		System.out.println("updated holdPrey:"+claw.holdPrey);
		System.out.println("updated name:"+claw.name);
		System.out.println("end holding through claw");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start identify crow");
		Crow crow=new Crow();
		crow.colour="black";
		crow.mass=300;
		
		System.out.println("updated colour:"+crow.colour);
		System.out.println("updated mass:"+crow.mass);
		System.out.println("updated lifespan:"+crow.lifespan);
		System.out.println("end identify crow");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start movement clock");
		Clock clock=new Clock();
		clock.price=35000;
		clock.hourHand=14;
		
		System.out.println("updated price:"+clock.price);
		System.out.println("updated hourHand:"+clock.hourHand);
		System.out.println("updated company:"+clock.company);
		System.out.println("end movement clock");
		
		
        System.out.println("=================================================");
		
		System.out.println("start lolipop");
		Lolipop lolipop=new Lolipop();
		lolipop.price=15;
		lolipop.brandName="chupaChups";
		
		System.out.println("updated price:"+lolipop.price);
		System.out.println("updated brandName:"+lolipop.brandName);
		System.out.println("updated country:"+lolipop.country);
		System.out.println("end lolipop");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start wearing of jean");
	    Jean jean=new Jean();
		jean.price=600;
		jean.type="baggy";
		
		System.out.println("updated price:"+jean.price);
		System.out.println("updated type:"+jean.type);
		System.out.println("updated size:"+jean.size);
		System.out.println("end wearing of jean");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start typing keyBoard");
	    KeyBoard keyBoard=new KeyBoard();
		keyBoard.count=40;
		keyBoard.shape="rectangle";
		
		System.out.println("updated count:"+keyBoard.count);
		System.out.println("updated shape:"+keyBoard.shape);
		System.out.println("updated noOfKeyboards:"+keyBoard.noOfKeyboards);
		System.out.println("end typing keyBoard");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start Mountains");
	    Mountains mountains=new Mountains();
		mountains.name="NandaDevi";
		mountains.elevation=7816f;
		
		System.out.println("updated name:"+mountains.name);
		System.out.println("updated elevation:"+mountains.elevation);
		System.out.println("updated loc:"+mountains.loc);
		System.out.println("end Mountains");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start match");
	    Stadium stadium=new Stadium();
		stadium.name="Chinnaswamy";
		stadium.match="RCB";
		
		System.out.println("updated name:"+stadium.name);
		System.out.println("updated match:"+stadium.match);
		System.out.println("updated loc:"+stadium.loc);
		System.out.println("end match");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start spraying");
	    Spray spray=new Spray();
		spray.price=55;
		spray.use="relief from muscle pain";
		
		System.out.println("updated price:"+spray.price);
		System.out.println("updated use:"+spray.use);
		System.out.println("updated name:"+spray.name);
		System.out.println("end spraying");
		
		
		
		
		
		
		
		
	}
}