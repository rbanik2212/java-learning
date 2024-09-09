package com.hzdg5l.springjpaprac.dao;

import java.util.List;
import com.hzdg5l.springjpaprac.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String value);

    void update(Student theStudent);

    void delete(int id);

    int deleteAll();

}
