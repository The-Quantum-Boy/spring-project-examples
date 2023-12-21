package com.sumit.querydsl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.querydsl.repository.AutherRepo;
import com.sumit.querydsl.repository.BookRepo;

@Service
public class AuthBookService {

	@Autowired
	private AutherRepo autherRepo;
	
	@Autowired
	private BookRepo bookRepo;
	
	
}
