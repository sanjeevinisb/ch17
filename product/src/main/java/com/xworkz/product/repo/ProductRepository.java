package com.xworkz.product.repo;

import com.xworkz.product.dto.ProductDto;

public interface ProductRepository {
	int save(ProductDto productDto);
	}

