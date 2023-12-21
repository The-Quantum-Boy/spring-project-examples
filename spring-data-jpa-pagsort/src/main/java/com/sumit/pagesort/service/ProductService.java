package com.sumit.pagesort.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sumit.pagesort.entity.Product;
import com.sumit.pagesort.repository.ProductRepo;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
//	  @PostConstruct
//	  public void initDB() {
//	      List<Product> products = IntStream.rangeClosed(1, 200)
//	              .mapToObj(i -> new Product("product" + i, new Random().nextInt(100), new Random().nextInt(50000)))
//	              .collect(Collectors.toList());
//	      productRepo.saveAll(products);
//	  }
//	  
	  
	  public List<Product> findAllProducts(){
		  return productRepo.findAll();
	  }
	  
	  //offset -next element
	  
	  public Page<Product> findProductsWithPagination(int offset, int pagesize){
		 return productRepo.findAll(PageRequest.of(offset, pagesize));
	  }
	  
	  public List<Product> findProductsWithSorting(String field){
		  return productRepo.findAll(Sort.by(field));
	  }
	  
	  public Page<Product> findProductsWithPaginationAndSorting(int offset, int pagesize, String fields){
			
		  return productRepo.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(fields)));
	  }
  
  
  
}
