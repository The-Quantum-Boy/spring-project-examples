package com.sumit.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.querydsl.models.Book;

public interface BookRepo  extends JpaRepository<Book, Integer>{

}
