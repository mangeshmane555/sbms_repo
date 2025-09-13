package in.mane.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.UserLogin;
import in.mane.binding.UserRegistration;
import in.mane.entity.UserRegistrationEntity;
import in.mane.entity.UserTaskEntity;
import in.mane.repository.UserRegistrationRepository;

@Controller
public class UserRegController {

	// Create Repository
	@Autowired
	private UserRegistrationRepository userRegistrationRepo;
	
	@GetMapping("/")
	public String loadHomePage(Model model) {

		return "index";
	}

	@GetMapping("/registerForm")
	public String loadRegForm(Model model) {

		// Creating Empty binding class object
		model.addAttribute("userData", new UserRegistration());
		return "userRegistration";
	}

	@PostMapping("/registerUser")
	public String handleSubmitBtn(UserRegistration user, Model model) {

//		System.out.println(user.getClass().getSimpleName());

		// Registration email validation
//		if (userRegistrationRepo.existsByUserEmail(user.getUserEmail())) {
//			model.addAttribute("msg", "Email is already registered.");
//			return "registrationForm";
//		}
		
		//passing an object of type UserRegistration to a repository (CrudRepository) 
		//but it expects an object of type UserRegistrationEntity.
		
		// Copy properties from DTO class to Entity class
		UserRegistrationEntity userRegEntity = new UserRegistrationEntity();
		BeanUtils.copyProperties(user, userRegEntity);
		UserTaskEntity taskEntity = new UserTaskEntity();
		
		List<UserTaskEntity> taskList = Arrays.asList(taskEntity);
		userRegEntity.setUserTask(taskList);
		
		// Insert data to db
		UserRegistrationEntity savedUser = userRegistrationRepo.save(userRegEntity);
		
		if (savedUser != null && savedUser.getUserId() != null) {
			model.addAttribute("msg", "Registered Successfully, Please Login to create New Task");
		}
		else {
	        model.addAttribute("msg", "Registration failed. Please try again.");
	        return "registrationForm";
	    }
//		System.out.println("savedUser Id"+ savedUser.getUserId()); 
		
		//form is bound to a model attribute named loginData & your controller method is providing it.
		model.addAttribute("loginData", new UserLogin());
		model.addAttribute("msg", "Registered Successfully, Please Login to create New Task");

		return "userLogin";
	}
	
	
}
