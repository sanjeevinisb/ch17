package com.xworkz.college.servlet;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDTO;


	@WebServlet(loadOnStartup = 1,urlPatterns = "/apply")
	public class CollegeServlet extends HttpServlet {

	public CollegeServlet() {
	System.out.println("Created CollegeServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running service in CollegeServlet...");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String mobile=req.getParameter("mobile");
	String address=req.getParameter("address");
	String fatherName=req.getParameter("fatherName");
	String motherName=req.getParameter("motherName");
	String percentage=req.getParameter("percentage");
	String course=req.getParameter("course");
	String age=req.getParameter("age");
	double convertedPercentage = Double.valueOf(percentage);
	int convertedAge = Integer.valueOf(age);
	long convertedMobile = Long.valueOf(mobile);
	
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Mobile:"+mobile);
	System.out.println("Address:"+address);
	System.out.println("FatherName :"+fatherName);
	System.out.println("MotherName :"+motherName);
	System.out.println("Percentage :"+percentage);
	System.out.println("Course :"+course);
	System.out.println("Age:"+age);


	PrintWriter printerWriter=resp.getWriter();
	printerWriter.println("success in sending Data");
	
	CollegeDTO collegeDTO= new CollegeDTO(name,email,convertedMobile,address,fatherName,motherName,convertedPercentage,course,convertedAge);
	 
	System.out.println("CollegeDTO :"+ collegeDTO);
	
}
	}
