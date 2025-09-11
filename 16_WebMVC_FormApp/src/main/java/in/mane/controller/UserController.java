package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String loadForm() {
		
		return "index";
	}
	
	// Getting form data in user java object
	@PostMapping("/user")
	public String handleSubmitButton(User user, Model model) {
		
		System.out.println(user);
		
		model.addAttribute("msg", "User saved");
		
		return "index";
		
	}
	
	
}
