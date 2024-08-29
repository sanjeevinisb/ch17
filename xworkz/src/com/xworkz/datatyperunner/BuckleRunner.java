package com.xworkz.datatyperunner;

import com.xworkz.datatype.Clip;
import com.xworkz.datatype.Buckle;
import com.xworkz.datatype.Pin;
import com.xworkz.datatype.Lock;

public class BuckleRunner {

	public static void main(String[] args) {
		Clip clip=new Clip();
		clip.support();//local
		
		Pin pin=new Pin();
		Buckle buckle1=new Buckle();
		pin.combine(buckle1);//parameter
		
		Lock lock=new Lock();
        Buckle buckle2=new Buckle();
        lock.buckle= buckle2;
        lock.connect();//instance 
 

	}

}
