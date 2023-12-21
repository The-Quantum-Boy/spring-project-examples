package com.sumit.r2dbc.db3.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	private int id;
	
	private String name;
	
	private String author;
	

}
