package com.jpa.dynamic.service.impl;

import com.jpa.dynamic.constant.SearchOperation;
import com.jpa.dynamic.criteria.SearchCriteria;
import com.jpa.dynamic.model.Student;
import com.jpa.dynamic.repository.StudentRepository;
import com.jpa.dynamic.service.StudentService;
import com.jpa.dynamic.specification.GenericSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private static final String ADDRESS = "address";
    private static final String ADDRESS_VALUE = "mille";
    private static final String AGE = "age";
    private static final int AGE_VALUE = 25;

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findStudentsWithPredicate() {
        GenericSpecification<Student> genericSpecification = new GenericSpecification<>();
        genericSpecification.add(new SearchCriteria(ADDRESS, ADDRESS_VALUE, SearchOperation.MATCH));
        genericSpecification.add(new SearchCriteria(AGE, AGE_VALUE, SearchOperation.GREATER_THAN));
        return studentRepository.findAll(genericSpecification);
    }
}
