package com.xworkz.superchainingrunner;
import com.xworkz.superchaining.ShootDigitalCamera;

public class DigitalCameraRunner {

	public static void main(String[] args) {
		ShootDigitalCamera shootDigitalCamera=new ShootDigitalCamera();
		shootDigitalCamera.capture();  
		
		shootDigitalCamera.share("Nikon"); 
		
		
		

	}

}
