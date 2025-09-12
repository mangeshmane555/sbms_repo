package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.UserLogin;
import in.mane.binding.UserTask;

@Controller
public class UserLoginController {
	
	
	@GetMapping("/loginForm")
	public String loadLoginForm(Model model) {

		model.addAttribute("loginData", new UserLogin());

		return "userLogin";

	}

	@PostMapping("/loginUser")
	public String handleLoginSubmitBtn(UserLogin user_login, Model model) {

		System.out.println(user_login);
//		Integer userId = user_login.getUserId();
		//verify username and password by db call & Get username using the userId and show on next page
//		String userEmail = user_login.getUserEmail();

		
		model.addAttribute("taskData", new UserTask());
//		model.addAttribute("msg", "Hello " + userEmail + " you are Logged in !");
		model.addAttribute("msg", "Logged in !! ");
		
		return "createTask";
	}

}
