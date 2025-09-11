package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
