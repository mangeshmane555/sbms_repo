package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

	
	
	
}
