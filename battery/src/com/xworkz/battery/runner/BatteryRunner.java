package com.xworkz.battery.runner;
 
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class BatteryRunner {

	public static void main(String[] args) {

			
String url="jdbc:mysql://127.0.0.1:3306/mbl";
String userName="root";
String password="Xworkzodc@123";

Connection connection = null;

try {
	connection = DriverManager.getConnection(url,userName,password);
	
	if(connection !=null) {
		
		System.out.println("This is connected");
		
	}
	else {
		
		System.out.println("This is not connected");
	}
	
} catch (SQLException e) {
	
	e.printStackTrace();
	
}
	}

}

	