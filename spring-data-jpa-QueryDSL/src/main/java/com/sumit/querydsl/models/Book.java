package com.sumit.querydsl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookId;
	
	private String name;
	private String isbn;
}
