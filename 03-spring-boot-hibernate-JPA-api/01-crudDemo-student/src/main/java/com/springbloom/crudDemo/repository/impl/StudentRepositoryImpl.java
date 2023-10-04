package com.springbloom.crudDemo.repository.impl;

import com.springbloom.crudDemo.entity.Student;
import com.springbloom.crudDemo.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private EntityManager entityManager;

    @Autowired
    public StudentRepositoryImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findByLastName(String lastname) {
        TypedQuery theQuery= entityManager.createQuery("FROM Student where lastName=:theLastName", Student.class);
        theQuery.setParameter("theLastName", lastname);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findAll() {
        TypedQuery theQuery= entityManager.createQuery("FROM Student", Student.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public int updateByLastName(String lastName) {
        Query updateQuery= entityManager.createQuery("UPDATE Student SET email='gopalps.668@gmail.com' where lastName=:theLastName");
        updateQuery.setParameter("theLastName", lastName);
        return updateQuery.executeUpdate();
    }

    @Override
    @Transactional
    public void removeById(int theId) {
        Query deleteQuery = entityManager.createQuery("DELETE from Student where id=:theId");
        deleteQuery.setParameter("theId", theId);
        deleteQuery.executeUpdate();
    }

    @Override
    @Transactional
    public void remove() {
        Student theStudent = findById(1000);
        entityManager.remove(theStudent);
    }
}
