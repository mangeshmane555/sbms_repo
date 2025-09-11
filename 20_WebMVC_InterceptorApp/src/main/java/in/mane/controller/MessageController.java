package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // Applied class level so it is available for all methods
public class MessageController {

	@GetMapping("/welcome")
	
	public String welcomeMsg() {
		
		return "Welcome to World";
	}
	
	@GetMapping("/greet")
	
	public String greetMsg() {
		
		return "Good Evening";
	}
}
