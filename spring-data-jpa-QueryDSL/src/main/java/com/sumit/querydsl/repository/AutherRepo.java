package com.sumit.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sumit.querydsl.models.Author;

public interface AutherRepo extends JpaRepository<Author, Integer> {

	@Query(value = "select * from Author where contactNo=?1", nativeQuery = true)
	Author getAuthorByContactNo(String contactNo);
}
