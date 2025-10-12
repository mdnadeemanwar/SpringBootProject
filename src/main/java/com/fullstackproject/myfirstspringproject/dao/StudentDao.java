package com.fullstackproject.myfirstspringproject.dao;

import com.fullstackproject.myfirstspringproject.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student theStudent);

    // add new method in Dao interface for accesing the data
    Student findByID(Integer Id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);
}
