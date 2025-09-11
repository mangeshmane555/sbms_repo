package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	
	
}
