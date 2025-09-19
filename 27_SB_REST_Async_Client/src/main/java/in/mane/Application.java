package in.mane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mane.service.MakeMyTripService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		MakeMyTripService myTripBean = context.getBean(MakeMyTripService.class);
		//myTripBean.getTicketInfo("161");
		myTripBean.getTicketAsync("161");
	}

}
