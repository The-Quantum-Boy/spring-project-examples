package com.sumit.repositories.db3;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sumit.entities.Book;

import reactor.core.publisher.Flux;

public interface BookRepo extends ReactiveCrudRepository<Book, Integer> {

   public Flux<Book> findByAuthor(String author);
}
