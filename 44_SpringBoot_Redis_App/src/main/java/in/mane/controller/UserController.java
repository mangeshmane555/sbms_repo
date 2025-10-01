package in.mane.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mane.model.User;
import in.mane.service.UserService;

@RestController
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@PostMapping("/user")
	public String add(@RequestBody User user) {
		
		return userService.addUser(user);
	} 
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable Integer userId) {
		
		return userService.getUser(userId);
	}
	
	public Collection<User> getAllUsers() {
		
		return userService.getAllUsers();
	}
	
	
}
