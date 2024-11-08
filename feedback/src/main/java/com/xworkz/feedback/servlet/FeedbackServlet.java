package com.xworkz.feedback.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.feedback.dto.FeedbackDTO;


	@WebServlet(loadOnStartup = 1,urlPatterns = "/apply")
	public class FeedbackServlet extends HttpServlet {

	public FeedbackServlet() {
	System.out.println("Created FeedbackServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String comment=req.getParameter("comment");
	
	
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Comment:"+comment);
	
	
	PrintWriter printerWriter=resp.getWriter();
	printerWriter.println("success in sending Data");
	
	FeedbackDTO feedbackDTO= new FeedbackDTO(name,email,comment);
	 
	System.out.println("FeedbackDTO :"+feedbackDTO);
}
	}
