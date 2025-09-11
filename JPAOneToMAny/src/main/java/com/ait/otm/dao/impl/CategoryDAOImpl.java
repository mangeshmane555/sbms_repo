package com.ait.otm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.entities.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO 
{
	// Creating the EntityManagerFactory
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	@Override
	public void saveCategory(CategoryEntity entity) {
		EntityManager em = factory.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			em.persist(entity);
			System.out.println("Category with products are persisted in DB");
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}
	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		//Creating EntityManager
		EntityManager em = factory.createEntityManager();
		CategoryEntity catEntity = em.find(CategoryEntity.class, categoryId);
		em.close();
		return catEntity;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		CategoryEntity catEntity = em.find(CategoryEntity.class, categoryId);		
		
		tx.begin();
		try {
			em.remove(catEntity);
			tx.commit();
			System.out.println("Category with product is removed DB successfully");
		} catch (Exception e) {
			tx.getRollbackOnly();
			e.printStackTrace();
		}
		finally {
			em.close();
		}
	}

}
