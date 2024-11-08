package com.xworkz.product.dto;

import lombok.AllArgsConstructor; 
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ProductDto {
	
	private String companyName;
	private String productName;
	private String productType;
	private int productQuantity;
	private double productCost;
	
	}

