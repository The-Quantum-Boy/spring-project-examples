package com.sumit.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sumit.entity.Coffee;

import reactor.core.publisher.Mono;

public interface CoffeeRepository extends ReactiveCrudRepository<Coffee, Long>{

	@Query("DELETE FROM coffee")
	Mono<Coffee> deleteAllById();
}
