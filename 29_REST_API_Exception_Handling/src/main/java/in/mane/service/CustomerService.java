package in.mane.service;

import org.springframework.stereotype.Service;

import in.mane.exception.CustomerNotFoundException;

// We can through Exception from Anywhere like Controller, Service or DAO classes but it can be handled by globally  

@Service
public class CustomerService {
	
	public String getCustomerNameById(Integer customerId) {
		
		if (customerId >= 100) {
			return "Virat Kohli";
		}else {
			 	
			throw new CustomerNotFoundException("Invalid Customer Id");
		}
	}
	

}
