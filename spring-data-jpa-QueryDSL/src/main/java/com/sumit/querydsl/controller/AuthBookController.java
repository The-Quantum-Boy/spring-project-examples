package com.sumit.querydsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.querydsl.service.AuthBookService;

@RestController
@RequestMapping("/rest")
public class AuthBookController {

	@Autowired
	private AuthBookService authBookService;
	
}
