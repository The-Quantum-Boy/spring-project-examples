package com.sumit.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.db2.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
