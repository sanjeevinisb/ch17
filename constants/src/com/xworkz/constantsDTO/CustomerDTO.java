package com.xworkz.constantsDTO;
import com.xworkz.constants.ProductType;
public class CustomerDTO {
	private String name;
	private String email;
	private ProductType productType;

	public CustomerDTO(String name, String email, ProductType productType) {
		this.name = name;
		this.email = email;
		this.productType = productType;
	}
	public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public ProductType getProductType() {
	return productType;
}
	public void display() {
		System.out.println("Name:"+getName());
		System.out.println("Email:"+getEmail());
		System.out.println("Product Type:"+getProductType());
	}

}
