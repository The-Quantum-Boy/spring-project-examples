package com.sumit.auditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.auditing.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
