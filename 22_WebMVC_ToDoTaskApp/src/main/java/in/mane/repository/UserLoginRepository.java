package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.UserLoginEntity;

public interface UserLoginRepository extends JpaRepository<UserLoginEntity, Integer> {

	
}