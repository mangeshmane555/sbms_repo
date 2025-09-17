
package in.mane.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.StatusUtil;
import in.mane.binding.Customer;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/customer", produces = { "application/xml", "application/json" })
	public Customer getCustomer() {

		Customer c = new Customer();
		c.setName("Raju");
		c.setGender("Male");
		c.setEmail("raju@gmail.com");

		return c; // Returning object as a response may face inter-operability problem so convert
					// it in json

	}

	@PostMapping(value = "/customer", 
				consumes = { "application/xml", "application/json" }, 
				produces = { "text/plain" })
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {

		System.out.println(customer);

		// Insert record logic in db
		return new ResponseEntity<>("Custemer Saved", HttpStatus.CREATED);
	}

}
