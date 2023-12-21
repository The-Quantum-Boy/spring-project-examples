package com.sumit.repositories.db1;


import com.sumit.annotations.Student;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.sumit.entities.Student;

import reactor.core.publisher.Flux;

@Repository
public interface StudentRepo extends R2dbcRepository<Student,Long> {
    public Flux<Student> findByName(String name);
    
    @Query(value = "SELECT * FROM student WHERE student.address = :addr")
    public Flux<Student> findByAddress(@Param("addr") String addr);
}
