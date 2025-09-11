package in.mane.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.mane.beans.Motor;

public class MainApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
//		Convert context to ConfigurableApplicationContext to tell IOC going to destroy
		ConfigurableApplicationContext cfg = (ConfigurableApplicationContext) context;
		cfg.registerShutdownHook();
	}
}
