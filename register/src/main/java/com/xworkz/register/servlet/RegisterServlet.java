package com.xworkz.register.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
	public class RegisterServlet extends HttpServlet {

	public RegisterServlet() {
	System.out.println("no-arg const of RegisterServlet...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String name = req.getParameter("name");
	String email = req.getParameter("email");

	System.out.println("after req parameters ");

	RegisterService registerService = new RegisterServiceImpl();
	boolean valid = registerService.validateAndSave(new RegisterDTO(name, email));

	req.setAttribute("fun", "Let me check,if its working......");
	req.setAttribute("no", 100);

	if (valid) {
	System.out.println("register is valid");
	req.setAttribute("success", "Register is Success");
	} else {
	System.out.println("register is invalid");
	req.setAttribute("failure", "Register is failure");
	req.setAttribute("dto", new RegisterDTO(name, email));

	}

	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Register.jsp");
	requestDispatcher.forward(req, resp);

	}

	}

