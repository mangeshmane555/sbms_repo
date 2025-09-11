package com.ait.test;

import java.util.List;

import com.ait.dao.EmployeeDAO;
import com.ait.dao.impl.EmployeeDAOImpl;
import com.ait.entity.EmployeeEntity;

public class Tester {
	public static void main(String[] args ) {
		
	EmployeeDAO dao = new EmployeeDAOImpl();
	/*
	 //Select single Records
	try {
			EmployeeEntity emp = dao.fetchEmployeeById(7369);
			System.out.println(emp);
		
	} catch (Exception e) {
		System.out.println(e);
	}
	*/
	
	/*
	//Select All Records
	List<EmployeeEntity> lst = dao.fetchEmployees();
	lst.forEach(System.out::println);
	*/
	
	List<Object[]> lst1 = dao.fetchNamesAndSalaries();
	lst1.forEach(obj->{
		System.out.println(obj[0]+" "+obj[1]);
		});
	
	}
}