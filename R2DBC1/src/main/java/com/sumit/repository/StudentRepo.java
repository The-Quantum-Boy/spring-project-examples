package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sumit.entity.Student;

import reactor.core.publisher.Mono;


public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	
}
