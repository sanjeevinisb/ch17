package com.xworkz.datatyperunner;
import com.xworkz.datatype.Cap;
import com.xworkz.datatype.Cover;
import com.xworkz.datatype.Fan;
import com.xworkz.datatype.Hat;
 
public class HatRunner {

	public static void main(String[] args) {
		Cap cap=new Cap();
		cap.wear();//local
		
		Fan fan=new Fan();
		Hat hat=new Hat();
		fan.tear(hat);//parameter
		
        Cover cover=new Cover();
        Hat hat2=new Hat();
        cover.hat=hat2;
        cover.fold();//instance 
	}

}
