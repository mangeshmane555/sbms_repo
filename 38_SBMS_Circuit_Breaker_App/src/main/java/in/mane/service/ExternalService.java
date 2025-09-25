package in.mane.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ExternalService {
	
	@CircuitBreaker(name = "myService", fallbackMethod = "getDataFromDB")
	 public String getDataFromRedis() {
	        // Simulate failure or remote call
	        double random = Math.random();
	        if (random < 0.5) {
	        	System.out.println("redis() method called");
	            throw new RuntimeException("Redis Server is down");
	        }
	        // logic to access data from redis
	        return "Data Accessed fron redis (Main Logic)";
	    }

	    // Fallback method – signature must match (or accept Throwable)
	    public String getDataFromDB(Throwable t) {
	        return "Fallback: " + t.getMessage();
	    }
	
}