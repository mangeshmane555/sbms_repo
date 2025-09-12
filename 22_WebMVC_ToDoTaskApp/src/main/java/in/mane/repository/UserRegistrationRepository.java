package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.UserRegistrationEntity;

public interface UserRegistrationRepository extends JpaRepository<UserRegistrationEntity, Integer> {

	
}
