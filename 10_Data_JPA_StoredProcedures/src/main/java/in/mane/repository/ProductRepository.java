package in.mane.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.mane.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "call getProducts()", nativeQuery = true)
	public List<Product> getAllProducts();
	
	
	
}
