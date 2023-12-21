package com.sumit.querydsl.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private int authorId;
	private String name;
	private String email;
	
	@OneToMany(
			targetEntity = Book.class, 
			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY
	)
	private List<Book> books;
}
