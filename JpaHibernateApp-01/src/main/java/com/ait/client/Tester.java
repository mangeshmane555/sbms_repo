package com.ait.client;

import com.ait.dao.ProductDAO;
import com.ait.dao.impl.ProductDAOImpl;
import com.ait.entity.ProductEntity;

public class Tester 
{
	public static void main(String[] args) 
	{
		
		/*Logic To Create ProductEntity In DB==========================
		//Access Implemented class object to the interface reference
		ProductDAO dao= new ProductDAOImpl();
		//
		ProductEntity entity = new ProductEntity(); Transient State
		entity.setProductId(44);
		entity.setProductName("Mobile");
		entity.setQuantity(7);
		entity.setUnitPrice(23000.00);
		//
		dao.saveProduct(entity);
		//============================================*/

		ProductDAO dao= new ProductDAOImpl();
		ProductEntity entity = dao.loadProductById(22);
		
		System.out.println("Name= "+entity.getProductName());
		System.out.println("Created On= "+entity.getCreatedOn());
		System.out.println("Quantity= "+entity.getQuantity());
		System.out.println("Price= "+entity.getUnitPrice());
		System.out.println("Lsst Updated= "+entity.getUpdatedOn());
		
	}
}
