package com.sumit.r2dbc.db3.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sumit.r2dbc.db3.entities.Book;

import reactor.core.publisher.Flux;

public interface BookRepo extends ReactiveCrudRepository<Book, Integer> {

   public Flux<Book> findByAuthor(String author);
}
