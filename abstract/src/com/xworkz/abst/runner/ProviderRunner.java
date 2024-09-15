package com.xworkz.abst.runner;
import com.xworkz.abst.internal.Provider;
import com.xworkz.abst.internal.InternetProvider;
import com.xworkz.abst.internal.DellProvider;
import com.xworkz.abst.internal.LenovoProvider; 
import com.xworkz.abst.internal.BookingProvider;
import com.xworkz.abst.internal.MovieBookingProvider;
import com.xworkz.abst.internal.AirtelInternetProvider;
import com.xworkz.abst.internal.ExtremeAirtelInternetProvider;
import com.xworkz.abst.internal.Fast5gExtreme;
import com.xworkz.abst.internal.JioInternetProvider;
import com.xworkz.abst.internal.SatJioInternetProvider;
import com.xworkz.abst.internal.BookMyShowMovieBookingProvider;


public class ProviderRunner {

	public static void main(String[] args) {

		InternetProvider internetProvider = new InternetProvider("Airtel","Gopal Vittal");
		InternetProvider internetProvider1 = new InternetProvider("Airtel","Gopal Vittal");
		System.out.println(internetProvider.toString());
		boolean type = internetProvider1.equals(internetProvider1);
		System.out.println("InternetProvider and InternetProvider1 :" + type);
		internetProvider.service();

		

		AirtelInternetProvider airtelInternetProvider = new AirtelInternetProvider("ISP provider", "Soumen Ray");
		AirtelInternetProvider airtelInternetProvider1 = new AirtelInternetProvider("vi", "pankaj");
		System.out.println(airtelInternetProvider.toString());
		boolean equal = airtelInternetProvider.equals(airtelInternetProvider1);
		System.out.println("airtelInternetProvider and airtelInternetProvider1 :" + equal);
		airtelInternetProvider.service();



		ExtremeAirtelInternetProvider extremeAirtelInternetProvider = new ExtremeAirtelInternetProvider("Airtel internet","sunil mittal");
		ExtremeAirtelInternetProvider extremeAirtelInternetProvider1 = new ExtremeAirtelInternetProvider("Airtel exstream Fiber","Soumen Ray");
		System.out.println(extremeAirtelInternetProvider.toString());
		boolean equal1 = extremeAirtelInternetProvider1.equals(extremeAirtelInternetProvider);
		System.out.println("Extreme Airtel1 and Extreme Airtel2 :" + equal1);
		extremeAirtelInternetProvider.service();

		

		Fast5gExtreme fast5gExtreme = new Fast5gExtreme("Airtel Xstream router", "Pradeep sinha");
		Fast5gExtreme fast5gExtreme1 = new Fast5gExtreme("Airtel Xstream router", "Chua Sock");
		System.out.println(fast5gExtreme.toString());
		boolean equal2 = fast5gExtreme.equals(fast5gExtreme1);
		System.out.println("5GExtreme and 5GExtreme2 :" + equal2);
		fast5gExtreme.service();

		

		JioInternetProvider jioInternetProvider = new JioInternetProvider("Jio AirFiber", "Anish roy");
		JioInternetProvider jioInternetProvider1 = new JioInternetProvider("Jio Fiber", "Anuj Jain ");
		System.out.println(jioInternetProvider.toString());
		boolean equal3 = jioInternetProvider.equals(jioInternetProvider1);
		System.out.println("jioInternetProvider and jioInternetProvider1 :" + equal3);
		jioInternetProvider.service();
		

		SatJioInternetProvider satJioInternetProvider = new SatJioInternetProvider("MEO", "Mukesh Ambani",55000000, 2016);
		SatJioInternetProvider satJioInternetProvider1 = new SatJioInternetProvider("SES", "Akash Ambani", 5500000,2016);
		System.out.println(satJioInternetProvider1.toString());
		boolean equal4 = satJioInternetProvider1.equals(satJioInternetProvider1);
		System.out.println("SatJioInternetProvider and SatJioInternetProvider1 :" + equal4);
		satJioInternetProvider.service();
		

		BookingProvider bookingProvider = new BookingProvider("Booking service","Glenn Fogel");
		BookingProvider bookingProvider1 = new BookingProvider("Booking service","Glenn Fogel");
		System.out.println(bookingProvider.toString());
		boolean equal5 = bookingProvider.equals(bookingProvider1);
		System.out.println("bookingProvider and bookingProvider1 is :" + equal5);
		bookingProvider.service();


		MovieBookingProvider movieBookingProvider = new MovieBookingProvider("Book my show", "Vivek");
		MovieBookingProvider movieBookingProvider1 = new MovieBookingProvider("Ticket Booking", "Kiran");
		System.out.println(movieBookingProvider.toString());
		boolean equal6 = movieBookingProvider.equals(movieBookingProvider1);
		System.out.println("MovieBookingProvider and MovieBookingProvider1" + equal6);
		movieBookingProvider.service();
		movieBookingProvider.book();
		movieBookingProvider.cancel();
	
		
		BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider = new BookMyShowMovieBookingProvider("Zuypay","Ashish",  8);
		BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider1 = new BookMyShowMovieBookingProvider("Zuypay","Ashish", 8);
		System.out.println(bookMyShowMovieBookingProvider.toString());
		boolean equal7 = bookMyShowMovieBookingProvider.equals(bookMyShowMovieBookingProvider);
		System.out.println("bookMyShowMovieBookingProvider and bookMyShowMovieBookingProvider1 is:" + equal7);
		bookMyShowMovieBookingProvider1.service();
		bookMyShowMovieBookingProvider1.book();
		bookMyShowMovieBookingProvider1.cancel();
		

		DellProvider dellProvider = new DellProvider("Dell Technologies"," Michael Dell");
		DellProvider dellProvider1 = new DellProvider("Dell Technologies"," Michael Dell");
		System.out.println(dellProvider.toString());
		boolean equal8 = dellProvider.equals(dellProvider1);
		System.out.println("dellProvider and dellProvider1 :" + equal8);
		dellProvider.service();
		

		LenovoProvider lenovoProvider = new LenovoProvider("Lenovo Technologies","shailender");
		LenovoProvider lenovoProvider1 = new LenovoProvider("Lenovo Technologies","shailender");
		System.out.println(lenovoProvider.toString());
		boolean equal9 = lenovoProvider.equals(lenovoProvider1);
		System.out.println("lenovoProvider and lenovoProvider1 :" + equal9);
		lenovoProvider.service();

	}
	}


