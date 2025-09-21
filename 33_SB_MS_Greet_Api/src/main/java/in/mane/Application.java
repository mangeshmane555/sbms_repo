package in.mane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Register as a client for three servers Admin Server, Eureka Server, Zipkin Server 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
