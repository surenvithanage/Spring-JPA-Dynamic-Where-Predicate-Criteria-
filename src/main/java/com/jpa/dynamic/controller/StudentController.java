package com.jpa.dynamic.controller;

import com.jpa.dynamic.model.Student;
import com.jpa.dynamic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/withDynamicSearch")
    public List<Student> withDynamicSearch() {
        return studentService.findStudentsWithPredicate();
    }

}