package com.xworkz.stacktrace;

public class EventStack {
public void method1() {
	System.out.println("method1");
	method2();
System.out.println("method2 complete");
}
	public void method2() {
		System.out.println("method2");
		method3();
		System.out.println("method3 complete");		
	}
	public void method3() {
		System.out.println("method3");
		try {
			method4();
		}
		catch(Exception exception) {
			System.err.println("exception in method4");
		}
		
}
	public void method4() {
		System.out.println("method4");
		method5();
		System.out.println("method5 complete");
		if(true) {
		throw new IllegalArgumentException();
		}
	}
	public void method5() {
		System.out.println("method5");
		method6();
		System.out.println("method6 complete");
	}
	public void method6() {
		  System.out.println("method6");
}
}
		
	


