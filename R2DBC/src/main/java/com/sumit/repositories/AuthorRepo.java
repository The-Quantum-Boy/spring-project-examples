package com.sumit.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sumit.entities.Author;

public interface AuthorRepo extends ReactiveCrudRepository<Author, Long> {

}
