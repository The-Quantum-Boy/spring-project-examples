package com.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entities.Book;
import com.sumit.service.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public Mono<Book> addBook(@RequestBody Book book){
		return bookService.addNewBook(book);
	}
	
	@PutMapping("/update/{id}")
	public Mono<Book> updateBook(@PathVariable("id") int id, @RequestBody Book book){
		return bookService.updateBook(id, book);
	}
	
	
	@GetMapping("/getByid/{id}")
	public Mono<ResponseEntity<Book>> getBookById(@PathVariable("id") int id){
		return bookService.findBookById(id)
				.map(ResponseEntity::ok)
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}
	
	 @GetMapping("/get/{name}")
	 public Flux<Book> listBooks(@PathVariable("name") String name) {
	    return bookService.findBookByName(name);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public Mono<Void> deleteStudent(@PathVariable("id") Integer id){
		 return bookService.deletBook(id);
	 }
	 
	 
	 @GetMapping("/getall")
	 public Flux<Book> getall(){
		 return bookService.findAllBook();
	 }
	
	
	
}
