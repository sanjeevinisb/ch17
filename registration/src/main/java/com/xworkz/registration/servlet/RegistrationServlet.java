package com.xworkz.registration.servlet;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.service.RegistrationService;
import com.xworkz.registration.service.RegistrationServiceImpl;


@WebServlet(loadOnStartup =1,urlPatterns="/registration")
public class RegistrationServlet extends HttpServlet{
	
	public RegistrationServlet() {
		System.out.println("no-arg const of RegisterationServlet...");
		}

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		int convertedAge = Integer.valueOf(age);

		System.out.println("after req parameters ");

		RegistrationService registrationService = new RegistrationServiceImpl();
		boolean valid = registrationService.validateAndSave(new RegistrationDTO(name, email,convertedAge,city,state,country));

		req.setAttribute("fun", "Let me check,if its working......");
		req.setAttribute("no", 100);

		if (valid) {
		System.out.println("register is valid");
		req.setAttribute("success", "Register is Success");
		} else {
		System.out.println("register is invalid");
		req.setAttribute("failure", "Register is failure");
		req.setAttribute("dto", new RegistrationDTO(name, email,convertedAge,city,state,country));

		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Registration.jsp");
		requestDispatcher.forward(req, resp);

		}

		}





	