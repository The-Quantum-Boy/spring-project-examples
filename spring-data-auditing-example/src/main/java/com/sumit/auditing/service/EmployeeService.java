package com.sumit.auditing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.auditing.model.Employee;
import com.sumit.auditing.repository.EmployeeRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeService {
	 @Autowired
	    private EmployeeRepo employeeRepository;

	    public Employee createEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    public Employee updateEmployee(Integer id, Employee employee) {
	        Employee existingEmployee = employeeRepository.findById(id)
	        		.orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + id));
	              
	        existingEmployee.setFirstName(employee.getFirstName());
	        existingEmployee.setLastName(employee.getLastName());
	        existingEmployee.setDept(employee.getDept());
	        return employeeRepository.save(existingEmployee);
	    }

	    public void deleteEmployee(Integer id) {
	        employeeRepository.deleteById(id);
	    }

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Employee getEmployeeById(Integer id) {
	        return employeeRepository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + id));
	    }
}
