package in.mane.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	// Get username form db
	@Override
	public UserDetails loadUserByUsername(String username)	{
		
		// User(username, password, roles_list)
		return new User("admin", "$2a$12$v0XzeLd92SlnuPrFnxSKf.azQoGd0bEqm168ACY5WBMJOyH38EWBC", new ArrayList<>());
	}
	
	
	
	

}
