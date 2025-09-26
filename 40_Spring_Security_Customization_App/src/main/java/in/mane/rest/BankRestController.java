package in.mane.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/balance")
	public String balance() {
		
		// login to check balance
		return "your balance = 120788.00 INR";
	}
	
	@GetMapping("/transfer")
	public String transfer() { 
		
		// login to check balance
		return "Your Amount transfer successfull";
	}
	
	@GetMapping("/loginCheck")
	public String login() { 
		
		// login to check balance
		return "Your Login success";
	}
	
	@GetMapping("/contact")
	public String contactInfo() { 
		
		return "Your contactUs= aaa@gmail.com";
	}
	
}
