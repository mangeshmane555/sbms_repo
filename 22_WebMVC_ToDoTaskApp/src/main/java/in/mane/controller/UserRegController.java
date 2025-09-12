package in.mane.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.UserLogin;
import in.mane.binding.UserRegistration;
import in.mane.entity.UserRegistrationEntity;
import in.mane.repository.UserLoginRepository;
import in.mane.repository.UserRegistrationRepository;

@Controller
public class UserRegController {

	// Create Repository
	@Autowired
	private UserRegistrationRepository userRegistrationRepo;
	
	@Autowired
	private UserLoginRepository userLoginRepo;
	
	
	@GetMapping("/")
	public String loadHomePage(Model model) {

		return "index";
	}

	@GetMapping("/registerForm")
	public String loadRegForm(Model model) {

		// Empty binding object
		model.addAttribute("userData", new UserRegistration());
		return "userRegistration";
	}

	@PostMapping("/registerUser")
	public String handleSubmitBtn(UserRegistration user, Model model) {

		System.out.println(user.getClass().getSimpleName());
		System.out.println(user);

		//you're trying to pass an object of type UserRegistration to a repository (CrudRepository) that expects an object of type UserRegistrationEntity.
		
		// Convert properties from DTO class to Entity class
		UserRegistrationEntity userRegEntity = new UserRegistrationEntity();
		BeanUtils.copyProperties(user, userRegEntity);
		
		// Insert data to db
		UserRegistrationEntity savedUser = userRegistrationRepo.save(userRegEntity);
		
		// To confirm that user data saved or not
//		return savedUser != null && savedUser.getUserId() != null;
		
		
		
//		System.out.println(" savedUser Id"+ savedUser.getUserId()); 
		
		// This Thymeleaf form is bound to a model attribute named loginData, but your controller method is  providing it.
		model.addAttribute("loginData", new UserLogin());
		model.addAttribute("msg", "Data Saved to the database");

		return "userLogin";
	}

	
	
	
}
