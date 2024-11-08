package com.xworkz.job.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.service.JobService;
import com.xworkz.job.service.JobServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/apply")
public class JobServlet extends HttpServlet {

	public JobServlet() {
		System.out.println("no-arg const of JobServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in JobServlet...");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String qualification = req.getParameter("qualification");
		String yop = req.getParameter("yop");
		String salaryExpectations = req.getParameter("salaryExpectations");
		double convertedSalaryExpectations = Double.valueOf(salaryExpectations);

		JobDTO jobDTO = new JobDTO(name, email, qualification, yop, convertedSalaryExpectations);

		JobService jobService = new JobServiceImpl();
		boolean validJobDTO = jobService.validateAndSave(jobDTO);
		if (validJobDTO) {
			System.out.println("Data is valid");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Job.jsp");
			req.setAttribute("name", jobDTO.getName());
			requestDispatcher.forward(req, resp);
		} else {
			System.out.println("Data is Invalid");
		}

		System.out.println("JobDTO :" + jobDTO);
		System.out.println("after getting all the parameters");
	}
}
