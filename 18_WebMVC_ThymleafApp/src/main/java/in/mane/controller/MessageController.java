package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
//	
//	@GetMapping("/welcome")
//	public String getWelcomeMessage(Model model) {
//		
//		model.addAttribute("message", "Welcome to Thymeleaf");	 
//		
//		return "display";
//		
//		
//	}
//	
	
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {
		
		return "Welcome to the world";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
				
		model.addAttribute("msg", "Good Evening");
		return "display";
	}
	

}
