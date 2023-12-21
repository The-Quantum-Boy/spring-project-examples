package com.sumit.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.sumit.entities.Book;


public interface BookRepo extends R2dbcRepository<Book, Long> {

}
