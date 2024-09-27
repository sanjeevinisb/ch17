package com.xworkz.stacktrace.runner;
import com.xworkz.stacktrace.EventStack;

public class EventRunner {

	public static void main(String[] args) {
		EventStack eventStack=new EventStack();
		eventStack.method1();
		System.out.println("method1 complete");

	}

}
