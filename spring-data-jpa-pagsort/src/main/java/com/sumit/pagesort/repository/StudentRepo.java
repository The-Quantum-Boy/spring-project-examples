package com.sumit.pagesort.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sumit.pagesort.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

	
	@Query(value = "select * from paging_student where city=:city",
		   countQuery = "select count(*) from paging_student where city=:city",
		   nativeQuery = true)
	Page<Student> findAllByCity(@Param("city") String city, Pageable pagable);
	
//	Page<Student> findAllByCity(String city, Pageable pagable);

}
