package com.hzdg5l.springjpaprac.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.hzdg5l.springjpaprac.entity.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jdk.jfr.Registered;

@Repository
public class StudentDAOImpl implements StudentDAO {

//define field for entity manager
//    inject entity manager using constructor injection

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
       return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student", Student.class);

        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String value) {
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student where lastName=:lastname", Student.class);
        theQuery.setParameter("lastname", value);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student = findById(id);

        entityManager.remove(student);

    }

    @Override
    @Transactional
    public int deleteAll() {
        int numsRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numsRowsDeleted;
    }


}
