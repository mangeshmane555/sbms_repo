package in.mane.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mane.GreetFiegnClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFiegnClient greetFiegnClient;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String port = env.getProperty("server.port");
		String welcomeMsg = "welcome to Latur("+port+")";
		
		// Accessing greetFiegnClient in Welcome-Api
		String greetMsg = greetFiegnClient.invokeGreetApi();
		 
		return greetMsg+", "+welcomeMsg;
		
	}
	
	
	
}
