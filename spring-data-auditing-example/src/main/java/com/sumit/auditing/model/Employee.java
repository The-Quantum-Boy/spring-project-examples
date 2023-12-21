package com.sumit.auditing.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	 
	    private String firstName;
	 
	    private String lastName;
	    
	    private String dept;
	 
	    @CreatedDate 
	    @Column(name = "created_at")
	    private LocalDateTime createdAt;
	 
	    @LastModifiedDate 
	    @Column(name = "updated_at")
	    private LocalDateTime updatedAt;
}
