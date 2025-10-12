package com.fullstackproject.myfirstspringproject.dao;

import com.fullstackproject.myfirstspringproject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{



    //define field for entity manager

    private EntityManager entityManager;

    //inject the entity manager with constructor injection

    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //impliment the save method

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findByID(Integer Id) {
        return entityManager.find(Student.class,Id);
    }

    @Override
    public List<Student> findAll(){
        //create query
        TypedQuery<Student> thequery = entityManager.createQuery("From Student ",Student.class);

        //return the query result
        return thequery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName){

        // create query
        TypedQuery<Student> theQuery =
                entityManager.createQuery("FROM Student WHERE lastName = :theData", Student.class);

        // set query parameter
        theQuery.setParameter("theData", theLastName);

        // return result
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent){
        entityManager.merge(theStudent);
    }



}
