package com.springbloom.crudDemo.repository;

import com.springbloom.crudDemo.entity.Student;

import java.util.List;

public interface StudentRepository {

    void save(Student student);

    Student findById(int id);

    List<Student> findByLastName(String lastname);

    List<Student> findAll();

    void update(Student theStudent);

    int updateByLastName(String lastName);

    void removeById(int id);

    void remove();
}
