package com.ait.dao;

import java.util.List;

import com.ait.entity.EmployeeEntity;

public interface EmployeeDAO {
	
	EmployeeEntity fetchEmployeeById(Integer empno);
	List<EmployeeEntity> fetchEmployees();	 
	List<Object[]> fetchNamesAndSalaries();
	
}
