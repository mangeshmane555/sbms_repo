package in.mane.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.mane.exception.CustomerNotFoundException;
import in.mane.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("customer/{customerId}")
	public String getCustomerName(@PathVariable Integer customerId) throws Exception {
		/*
		if (customerId >= 100) {
			return "Virat Kohli";
		}else {
			 	
			throw new CustomerNotFoundException("Invalid Customer Id");
		}
		*/
		
		return service.getCustomerNameById(customerId);
		
	}
	
}
