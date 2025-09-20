package in.mane.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import in.mane.binding.User;

@RestController
public class UserRestController {
	
	@GetMapping("/user")
	public ResponseEntity<User> getUser() {
		
		User user = new User(101, "john", "john@gmail.com");
		
		user.add(linkTo(methodOn(UserRestController.class).getUser()).withSelfRel());
		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		
		// Logic to update data
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		// Logic to Insert data
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
		
		// Logic to delete data
		return new ResponseEntity<>("Deleted", HttpStatus.OK);
	}
	
}
