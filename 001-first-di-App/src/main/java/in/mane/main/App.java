package in.mane.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mane.beans.Car;
import in.mane.beans.PetrolEngine;

public class App {
	public static void main(String[] args) {
			
		//Starting IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		PetrolEngine pe1 = context.getBean(PetrolEngine.class);
			
		Car car = context.getBean(Car.class);
		car.drive();
	}
}
