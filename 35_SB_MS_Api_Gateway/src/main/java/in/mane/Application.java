package in.mane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Register to Eureka Server as a client
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
