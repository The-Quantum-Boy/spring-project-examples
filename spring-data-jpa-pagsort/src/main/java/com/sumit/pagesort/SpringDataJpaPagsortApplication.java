package com.sumit.pagesort;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.pagesort.entity.Student;
import com.sumit.pagesort.repository.StudentRepo;

@SpringBootApplication
public class SpringDataJpaPagsortApplication implements CommandLineRunner{

   
	@Autowired
	private StudentRepo studentRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPagsortApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Student> students= new ArrayList<>();
//		students.add(Student.builder().name("sumit").city("UK").build());
//		students.add(Student.builder().name("John").city("New York").build());
//		students.add(Student.builder().name("Emily").city("London").build());
//		students.add(Student.builder().name("Michael").city("Paris").build());
//		students.add(Student.builder().name("Jessica").city("Sydney").build());
//		students.add(Student.builder().name("William").city("Toronto").build());
//		students.add(Student.builder().name("Samantha").city("Los Angeles").build());
//		students.add(Student.builder().name("Alex").city("Melbourne").build());
//		students.add(Student.builder().name("Sophia").city("Barcelona").build());
//		students.add(Student.builder().name("David").city("Berlin").build());
//	    students.add(Student.builder().name("Olivia").city("Tokyo").build());
//		students.add(Student.builder().name("Robert").city("Dubai").build());
//		students.add(Student.builder().name("Isabella").city("Mumbai").build());
//		students.add(Student.builder().name("James").city("Beijing").build());
//		students.add(Student.builder().name("Mia").city("Bangkok").build());
//		students.add(Student.builder().name("Daniel").city("Moscow").build());
//		students.add(Student.builder().name("Ava").city("Singapore").build());
//		students.add(Student.builder().name("Matthew").city("Shanghai").build());
//		students.add(Student.builder().name("Emma").city("Cairo").build());
//		students.add(Student.builder().name("Andrew").city("Rome").build());
//		students.add(Student.builder().name("Charlotte").city("Stockholm").build());
//		students.add(Student.builder().name("Luke").city("Vienna").build());
//		students.add(Student.builder().name("Grace").city("Athens").build());
//		students.add(Student.builder().name("Benjamin").city("Seoul").build());
//		students.add(Student.builder().name("Chloe").city("Lima").build());
//		students.add(Student.builder().name("Christopher").city("Hanoi").build());
//		students.add(Student.builder().name("Lily").city("Dublin").build());
//		students.add(Student.builder().name("Kevin").city("Oslo").build());
//		students.add(Student.builder().name("Zoe").city("Wellington").build());
//		students.add(Student.builder().name("Nicholas").city("Amsterdam").build());
//		students.add(Student.builder().name("Hannah").city("Budapest").build());
//		
//		
//		studentRepo.saveAll(students);
		
		
	}

}
