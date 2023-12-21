package com.sumit.r2dbc.db1.controller;

import com.sumit.r2dbc.db1.entities.Student;
import com.sumit.r2dbc.db1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public Mono<Student> addNewStudent(@RequestBody Student student) {
        return studentService.addNewStudent(student);
    }
    
    
    @GetMapping("/getStudent/{id}")
    public Mono<ResponseEntity<Student>> getStudent(@PathVariable long id) {
        return studentService.findStudentById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }





    @PutMapping("/update/{id}")
    public Mono<ResponseEntity<Student>> updateStudent(@PathVariable long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public Mono<ResponseEntity<Void>> deleteStudent(@PathVariable long id) {
        return studentService.findStudentById(id)
                .flatMap(s ->
                        studentService.deleteStudent(s)
                                .then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
                )
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @GetMapping("/address/{address}")
    public Flux<Student> findbyaddress(@PathVariable("address") String address){
    	return studentService.findStudentByAddress(address);
    }
    
    
}