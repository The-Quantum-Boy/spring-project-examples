package com.sumit.r2dbc.db3.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.r2dbc.db3.entities.Book;
import com.sumit.r2dbc.db3.repositories.BookRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	
	public Flux<Book> findAllBook(){
		return bookRepo.findAll();
	}
	
    public Flux<Book> findBookByName(String name) {
        return (name != null) ? bookRepo.findByAuthor(name) : bookRepo.findAll();
    }

    public Mono<Book> findBookById(int id) {
        return bookRepo.findById(id);
    }

    public Mono<Book> addNewBook(Book book) {
        return bookRepo.save(book);
    }

    public Mono<Book> updateBook(int id, Book book) {
        return bookRepo.findById(id)
                .flatMap(s -> {
                    s.setName(book.getName());
                    s.setAuthor(book.getAuthor());
                    return bookRepo.save(s);
                });
    }

    public Mono<Void> deletBook(int  id) {
        return bookRepo.findById(id)
               .flatMap(b->{
            	   return bookRepo.delete(b);
               });
    }
}
