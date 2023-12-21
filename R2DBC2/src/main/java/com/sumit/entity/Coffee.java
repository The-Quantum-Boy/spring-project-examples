package com.sumit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coffee")
public class Coffee {

	@Id
	private Long id;
	
	private String name;
}
