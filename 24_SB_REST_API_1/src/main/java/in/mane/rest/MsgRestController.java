package in.mane.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	public MsgRestController() {
		
		System.out.println("MsgRestController - Constructor");
	}
	
	// ResponseEntity taken to send custom body and status code
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		
		String msg = "Welcome to world";
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg = "Good Evening";
		return msg;
	}
	
}
