package com.sumit.pagesort.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.pagesort.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
