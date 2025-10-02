package in.mane.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
