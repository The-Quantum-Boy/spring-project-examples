package com.sumit.repositories.db2;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.sumit.entities.Teacher;

import reactor.core.publisher.Flux;

@Repository
public interface TeacherRepo extends ReactiveCrudRepository<Teacher,Long> {

    public Flux<Teacher> findByName(String name);
}
