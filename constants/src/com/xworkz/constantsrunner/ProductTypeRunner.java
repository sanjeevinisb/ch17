package com.xworkz.constantsrunner;
import com.xworkz.constants.ProductType;
import com.xworkz.constantsDTO.CustomerDTO;

public class ProductTypeRunner {

	public static void main(String[] args) {
		CustomerDTO customer=new CustomerDTO("Sanjeevini","sanjeevini@gmail.com",ProductType.FURNITURE);
		customer.display();
	}

}
