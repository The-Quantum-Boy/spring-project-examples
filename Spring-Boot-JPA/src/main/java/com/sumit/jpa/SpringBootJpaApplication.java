package com.sumit.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.jpa.entity.Guardian;
import com.sumit.jpa.entity.Student;
import com.sumit.jpa.repository.StudentRepository;

@SpringBootApplication
public class SpringBootJpaApplication implements ApplicationRunner  {

	@Autowired
	private StudentRepository studentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		saveStudenWithGuardian();
		
//		List<Student> list=studentRepo.findAll();
//		System.out.println(list);
		
//		printStudentByFirstName();
//		printStudentByFirstNameContaining();
//		printStudentByFirstNameNotNull();
//		printStudentByGuardian();
		printAllStudent();
//		printStudentByLastName();
	}
	
	public void saveStudenWithGuardian() {
		
		
		Guardian guardian =Guardian.builder()
				.name("shubham")
				.email("sffdfd@gmail.com")
				.mobile("123554667")
				.build();
		
		Student student=Student.builder()
				.firstName("sumit")
				.lastName("dhanorkar")
				.email("sumit@gmail.com")
				.guardian(guardian)
				.build();
		
		studentRepo.save(student);
	
	}
	
	public void printStudentByFirstName() {
		List<Student> student=studentRepo.findByFirstName("shidvam");
		System.out.println("this is student "+student);
	}
	
	public void printStudentByFirstNameContaining() {
		List<Student> student =studentRepo.findByFirstNameContaining("sh");
		
		System.out.println(" this is  containing babu "+student);
	}
	
	public void printStudentByGuardian() {
		List<Student> student=studentRepo.findByGuardian("sumit");
		
		System.out.println(" this is  guardian babu records"+student);

	}
	
	public void printStudentByFirstNameNotNull() {
	List<Student> student=studentRepo.findByFirstNameNotNull();
		
		System.out.println(" this is student babu records not null"+student);
	}
	
	public void printAllStudent() {
		List<Student> students=studentRepo.findAllStudent();
		students.forEach((s)->{
			System.out.println(s);
		});
		System.out.println("----------------------------------------------------------------");
		//using native query
		List<Student> students2=studentRepo.getStudent();
		students.forEach((s)->{
			
			System.out.println("Student "+s);
		});
		
	}
	
	public void printStudentByLastName() {
		Student stud=studentRepo.getStudentByLastName("dhanorkar","sumit@gmail.com");
		
		System.out.println("student data => "+stud);
		
	}

}
