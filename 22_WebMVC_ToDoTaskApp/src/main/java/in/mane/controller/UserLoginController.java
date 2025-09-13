package in.mane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import in.mane.binding.UserLogin;
import in.mane.binding.UserTask;
import in.mane.entity.UserLoginEntity;
import in.mane.entity.UserRegistrationEntity;
import in.mane.repository.UserLoginRepository;
import in.mane.repository.UserRegistrationRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserLoginController {

	@Autowired
	private UserLoginRepository userLoginRepo;

	@Autowired
	private UserRegistrationRepository userRegistrationRepo;

	@GetMapping("/loginForm")
	public String loadLoginForm(Model model) {

		model.addAttribute("loginData", new UserLogin());
		return "userLogin";
	}

	@PostMapping("/loginUser")
	public String handleLoginSubmitBtn(UserLogin login_data, Model model, HttpSession session) {

//		System.out.println("login_data type= "+ login_data.getClass().getSimpleName());
		// save data to db
		UserLoginEntity loginEntity = new UserLoginEntity();
		loginEntity.setUserId(login_data.getUserId());
		loginEntity.setUserEmail(login_data.getUserEmail());
		loginEntity.setUserPwd(login_data.getUserPwd());

//		UserLoginEntity savedLogin = userLoginRepo.save(loginEntity);
//		System.out.println("Inserted *******!!");

		// findByUserEmail
		UserRegistrationEntity userRegEntity = userRegistrationRepo.findByUserEmail(login_data.getUserEmail());

		System.out.println("userRegEntity  ==  " + userRegEntity);
//		System.out.println("email by input === ****"+login_data.getUserEmail());
//		System.out.println("email by db call ===**** "+userRegEntity.getUserEmail());

		if (!(login_data.getUserEmail().equals(userRegEntity.getUserEmail()))
				&& !(login_data.getUserPwd().equals(userRegEntity.getUserPwd()))) {

			model.addAttribute("error", "Invalid email or password.");
			model.addAttribute("loginData", new UserLogin());
			return "userLogin";
		}

//		 Adding userRegEntity to session
//		session.setAttribute("userName", userRegEntity.getUserName());
		session.setAttribute("userEmail", userRegEntity.getUserEmail());

		model.addAttribute("msg", "Hello " + userRegEntity.getUserName() + ", You are Logged in !!");

		model.addAttribute("taskData", new UserTask());
		return "createTask";
	}

	@GetMapping("/userLogout")
	public String userLogout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("msg", "You have been logged out successfully");
		return "index";
	}
	
	
	
}
