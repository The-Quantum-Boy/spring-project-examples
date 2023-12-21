package com.sumit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.entity.Student;
import com.sumit.repository.StudentRepo;

@SpringBootApplication
public class R2Dbc1Application  {
	public static void main(String[] args) {
		SpringApplication.run(R2Dbc1Application.class, args);
	}
}
