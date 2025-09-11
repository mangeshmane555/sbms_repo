package com.ait.client;

import java.lang.classfile.constantpool.ConstantPool;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public class Tester {

	public static void main(String[] args) {
		
//		//Access Implemented class object to the interface reference
//		StudentDAO dao = new StudentDAOImpl();
//		
//		StudentCompositeKey compositeKey = new StudentCompositeKey();
//		compositeKey.setRolNumber(101);
//		compositeKey.setSection("B");
//		//
//		StudentEntity entity = new StudentEntity();
//		entity.setCompositeKey(compositeKey);
//		entity.setStudentName("SANJAY");
//		entity.setMarks(800);
//		//
//		dao.saveStudent(entity);
		
		//Fetch StudentEntity
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRolNumber(101);
		compositeKey.setSection("A");
		//
		StudentDAO dao = new StudentDAOImpl();
		StudentEntity entity = dao.fetchStudent(compositeKey);
		System.out.println("Name = "+entity.getStudentName());
		System.out.println("MArks= "+ entity.getMarks());
		
	}

}
