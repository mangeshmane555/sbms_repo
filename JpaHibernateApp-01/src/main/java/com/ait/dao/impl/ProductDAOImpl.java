package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.ProductDAO;
import com.ait.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	 	
	@Override
	public ProductEntity saveProduct(ProductEntity product) {
	
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		try {
			entityManager.persist(product); // Persistent State
			tx.commit();
			System.out.println("Product is inserted to db");
		} catch (Exception ex) {
			tx.rollback();
			System.out.println("Error while inserting"+ex);
		}
		finally {
			entityManager.close(); // Detach State
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity pe= entityManager.find(ProductEntity.class, productId);
		
		entityManager.close(); 
		
		return pe;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double unitPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductByid(Integer productId) {
		// TODO Auto-generated method stub

	}

}
