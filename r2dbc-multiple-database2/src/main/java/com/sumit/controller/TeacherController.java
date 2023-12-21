package com.sumit.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.sumit.entities.Teacher;
import com.sumit.service.TeacherService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/teacher")
public class TeacherController {



    @Autowired
    private TeacherService teacherService;

    @PostMapping("/add")
    public Mono<Teacher> addNewTeacher(@RequestBody Teacher teacher) {
        return teacherService.addNewTeacher(teacher);
    }

    @GetMapping("/get/{id}")
    public Mono<Teacher> getTeacher(@PathVariable long id) {
        return teacherService.findTeacherById(id);
    }

    @GetMapping("/getbyname/{name}")
    public Flux<Teacher> listTeacher(@PathVariable String name) {
        return teacherService.findStudentsByName(name);
    }



    @PutMapping("/update/{id}")
    public Mono<Teacher> updateTeacher(@PathVariable long id, @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteTeacher(@PathVariable long id) {
        return teacherService.deleteTeacher(id);
    }
}
