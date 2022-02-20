package com.jpa.dynamic.service;

import com.jpa.dynamic.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    List<Student> findStudentsWithPredicate();

}
