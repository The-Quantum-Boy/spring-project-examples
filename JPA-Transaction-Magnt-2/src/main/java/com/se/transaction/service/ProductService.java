package com.se.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.transaction.dto.Product;
import com.se.transaction.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public void SaveProductInfo() {
		
		for(int i=0;i<10;i++) {
			Product product=new Product();
			product.setId(i);
			product.setName("prouduct "+i);
			
			
			productRepo.saveProduct(product);
			
			if(i==7) {
				throw new RuntimeException("Something has been happned");
			}
			
		}
		
	}
}
