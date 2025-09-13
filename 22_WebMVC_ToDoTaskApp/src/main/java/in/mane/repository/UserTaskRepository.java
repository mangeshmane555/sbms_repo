package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.UserTaskEntity;

public interface UserTaskRepository extends JpaRepository<UserTaskEntity, Integer> {

	
	
}
