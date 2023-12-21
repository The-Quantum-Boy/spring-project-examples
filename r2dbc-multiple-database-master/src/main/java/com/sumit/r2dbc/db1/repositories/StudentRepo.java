package com.sumit.r2dbc.db1.repositories;

import com.sumit.r2dbc.db1.entities.Student;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface StudentRepo extends ReactiveCrudRepository<Student,Long> {
    public Flux<Student> findByName(String name);
    
    @Query(value = "SELECT * FROM student WHERE student.address = :addr")
    public Flux<Student> findByAddress(@Param("addr") String addr);
}
