package in.mane.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mane.models.AuthenticationRequest;
import in.mane.models.AuthenticationResponse;
import in.mane.util.JwtUtil;

@RestController
public class MyRestController {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> auhentication(@RequestBody AuthenticationRequest request){
		
		try {
			authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
			
		} catch (Exception e) {
			new Exception("Invalid Credentials");
		}
		
		UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
		
		String jwt = jwtUtil.generateToken(userDetails);
		AuthenticationResponse response = new AuthenticationResponse(jwt);
				
		return new ResponseEntity<>(response, HttpStatus.OK);
		
		
	}
	
	public String sayHello() {
		
		return "Hello world";
	}
	
}
