package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Student;
import com.sumit.repository.StudentRepo;


@RestController
@RequestMapping("/api")
public class StudentController {

	
	@Autowired
	private  StudentRepo repo;
	

	
	@GetMapping("/findall")
	public List<Student> findAllStudent(){
		
		return repo.findAll();
	}
	
}
