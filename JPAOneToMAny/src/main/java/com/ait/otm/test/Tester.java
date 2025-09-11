package com.ait.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.dao.impl.CategoryDAOImpl;
import com.ait.otm.entities.CategoryEntity;
import com.ait.otm.entities.ProductEntity;

public class Tester {

	public static void main(String[] args) throws Exception
	{	
		CategoryDAO dao = new CategoryDAOImpl();
		
		/*
		 * Add Category with Products
		CategoryEntity catEntity = new CategoryEntity();
		catEntity.setCategoryId(1423401);
		catEntity.setCategoryName("ELECTRONICS");
		
		//Create Product entity1 first
		ProductEntity prodEntity1 = new ProductEntity();
		prodEntity1.setProductId(34243);
		prodEntity1.setProductName("Mobile");
		
		File file = new File("D:\\Images\\img1.jpg");
		byte[] imagesBytes = new byte[(int)file.length()];
		
		FileInputStream fis = new FileInputStream(file);
		fis.read(imagesBytes);
		prodEntity1.setProductImage(imagesBytes);
//		fis.close();
		
		//Create Product entity2 first
		ProductEntity prodEntity2 = new ProductEntity();
		prodEntity2.setProductId(24234);
		prodEntity2.setProductName("Televiosion");
		
		File file2 = new File("D:\\Images\\img2.jpg");
		byte[] imagesBytes_tv = new byte[(int)file2.length()];
		
		FileInputStream fis2 = new FileInputStream(file2);
		fis2.read(imagesBytes_tv);
		
		prodEntity2.setProductImage(imagesBytes_tv);
//		fis2.close();
				
		//Create Product entity3 first
		ProductEntity prodEntity3 = new ProductEntity();
		prodEntity3.setProductId(4234);
		prodEntity3.setProductName("MicroOven");
		
		File file3 = new File("D:\\Images\\img3.jpg");
		byte[] imagesBytes_micro = new byte[(int)file3.length()];
		
		FileInputStream fis3 = new FileInputStream(file3);
		fis3.read(imagesBytes_micro);
		
		prodEntity3.setProductImage(imagesBytes_micro);
//		fis3.close();		
		
		List<ProductEntity> lstOfProducts = Arrays.asList(prodEntity1, prodEntity2, prodEntity3);
		
		catEntity.setLstOfProducts(lstOfProducts);
		
		dao.saveCategory(catEntity);
		*/
		
		// Fetch Products
		CategoryEntity cEntity= dao.fetchCategory(12101);
		
		System.out.println("Category Name : "+ cEntity.getCategoryName());
		
		List<ProductEntity> lst = cEntity.getLstOfProducts();
		ProductEntity pEntity = lst.get(0);
		System.out.println("Prosuct Id = "+pEntity.getProductId());
		System.out.println("Prosuct Name  = "+pEntity.getProductName());
		
		byte[] imageBytes = pEntity.getProductImage();
		
		File f1 = new File("D:\\Iamges\\img1_dbimage.jpg");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(imageBytes);
		System.out.println("Please Check the image at"+ f1.getAbsolutePath());
		
		/*
		 * call removeCategory()
		 
			dao.removeCategory(12101);
		*/
		
	}

}
