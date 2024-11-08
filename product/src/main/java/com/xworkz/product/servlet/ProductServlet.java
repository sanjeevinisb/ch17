package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.serviceImpl.ProductServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("created ProductServlet const ");
	}

	@Override

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductDto productDto = new ProductDto();
		productDto.setCompanyName(req.getParameter("companyName"));
		productDto.setProductName(req.getParameter("productName"));
		productDto.setProductType(req.getParameter("productType"));
		productDto.setProductQuantity(Integer.parseInt(req.getParameter("productQuantity")));
		productDto.setProductCost(Double.parseDouble(req.getParameter("productCost")));

		ProductService productService = new ProductServiceImpl();
		boolean validationOfDTO = productService.isValidAndSave(productDto);
		if (validationOfDTO) {
			System.out.println("valid data");

			RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
			req.setAttribute("ProductQuantity", productDto.getProductQuantity());
			req.setAttribute("Success", "Quantity Matches!!");

			dispatcher.forward(req, resp);

		} else {
			System.out.println("invalid data");
			RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
			req.setAttribute("Product", "Invalid Quantity!!");
			dispatcher.forward(req, resp);

		}

	}

}
