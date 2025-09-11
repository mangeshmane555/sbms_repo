package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.StudentDAO;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveStudent(StudentEntity entity) {
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		try {
			entityManager.persist(entity);
			tx.commit();
			System.out.println("StudentEntity is Inserted");
		} catch (Exception ex) {
			tx.rollback();
			System.out.println("Issue in StudentEntity Inserting "+ ex);
		}
		finally {
			entityManager.close(); 
		}
	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		//Transaction is not required 
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
		
		entityManager.close();
		return entity;
	}

}
