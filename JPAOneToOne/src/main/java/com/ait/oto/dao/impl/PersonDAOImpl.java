package com.ait.oto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.entities.Person;

public class PersonDAOImpl implements PersonDAO 
{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	@Override
	public void savePerson(Person person) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
				em.merge(person);
				tx.commit();
				System.out.println("Pesron object Inserted in db");
				
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {			
			em.close();
		}
	}

	@Override
	public Person findPerson(Person personId) {
		EntityManager em = factory.createEntityManager();
		Person person = em.find(Person.class, personId);
		
		em.close();
		return person;
	}

	@Override
	public void removePerson(Integer personId) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		try {
				Person person = em.find(Person.class, personId);
				em.remove(person);
				tx.commit();
				System.out.println("Person Object is deleted");
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}
		
	}

}
