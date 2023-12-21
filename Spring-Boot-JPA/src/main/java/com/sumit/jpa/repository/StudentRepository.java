package com.sumit.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sumit.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstName(String firstName);
	
	public List<Student> findByFirstNameContaining(String name);
	
	public List<Student> findByFirstNameNotNull();
	
	public List<Student> findByGuardian(String guardianName);
	
	//jpql
	@Query("select s From Student s")
	public List<Student> findAllStudent();
	
	@Query("select s From Student s Where s.lastName=:n and s.email=:e")
	public Student getStudentByLastName(@Param("n") String lastName, @Param("e") String email);
	
	
	//native query
	@Query(value = "select * from tbl_student", nativeQuery = true)
	public List<Student> getStudent();
}
