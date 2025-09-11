package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {

		String msg = "Welcome to the world";
		int i = 10 / 0;

		return msg;

	}

	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMsg() {
		
		String msg = "Good Evening"; 
		return msg;

	}

}
