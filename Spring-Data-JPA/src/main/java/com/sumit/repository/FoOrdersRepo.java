package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entities.FoOrders;

public interface FoOrdersRepo extends JpaRepository<FoOrders, String>{
	
	FoOrders findByIntrOrdNo(String intrOrdNo);

}
