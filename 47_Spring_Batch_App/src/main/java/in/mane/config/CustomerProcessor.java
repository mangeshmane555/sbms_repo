package in.mane.config;

import org.springframework.batch.item.ItemProcessor;

import in.mane.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
	
	@Override
	public Customer process(Customer item) throws Exception {
		// Logic to process data
		
		return item;
	}
	
}
