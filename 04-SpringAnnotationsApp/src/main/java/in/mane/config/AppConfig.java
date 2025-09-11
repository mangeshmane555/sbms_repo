package in.mane.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.mane.beans.Robot;

@Configuration
@ComponentScan(basePackages = { "in.mane", "com.ibm" })
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig : Constructor");
	}
	
	// Object is created by programmer but not IOC Container
	//To Create a method to create object of Robot Class and will return its object
	
	@Bean // Its s class level Annotation
	public Robot buildRobot(){
		// Some Logic 
		Robot r = new Robot();
		return r; 
	}
}
