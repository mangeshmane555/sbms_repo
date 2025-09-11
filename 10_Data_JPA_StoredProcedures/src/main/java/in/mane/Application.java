package in.mane;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mane.entity.Product;
import in.mane.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		List<Product> allProducts = productRepo.getAllProducts();
		allProducts.forEach(s->System.out.println(s));

	
	
	}

}
