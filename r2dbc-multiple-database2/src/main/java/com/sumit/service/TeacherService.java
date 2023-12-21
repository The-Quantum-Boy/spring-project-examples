package com.sumit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.entities.Teacher;
import com.sumit.repositories.db2.TeacherRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TeacherService {

    @Autowired
    TeacherRepo teacherRepo;

    public Flux<Teacher> findStudentsByName(String name) {
        return (name != null) ? teacherRepo.findByName(name) : teacherRepo.findAll();
    }

    public Mono<Teacher> findTeacherById(long id) {
        return teacherRepo.findById(id);
    }

    public Mono<Teacher> addNewTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public Mono<Teacher> updateTeacher(long id, Teacher teacher) {
        return teacherRepo.findById(id)
                .flatMap(t -> {
                    t.setName(teacher.getName());
                    t.setSubject(teacher.getSubject());
                    return teacherRepo.save(t);
                });

    }

    public Mono<Void> deleteTeacher(long id) {
        return teacherRepo.deleteById(id);
    }

}
