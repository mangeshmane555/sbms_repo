package in.mane;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mane.entity.Address;
import in.mane.entity.Employee;
import in.mane.repository.AddressRepository;
import in.mane.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepository empRepo = context.getBean(EmpRepository.class);
		AddressRepository addressRepo = context.getBean(AddressRepository.class);
		
		/*
		Employee e = new Employee();
		e.setEmpName("Raja");
		e.setEmpSalary(4000.00);
		
		Address a1 = new Address();
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		a1.setEmp(e);
		
		
		Address a2 = new Address();
		a2.setCity("Latur");
		a2.setState("Maha");
		a2.setCountry("India");
		a2.setEmp(e);

		// Setting addresses to employee
		List<Address> addrList = Arrays.asList(a1, a2);
		
		e.setAddr(addrList);
		
		empRepo.save(e);
		System.out.println("Records Inserted");
		*/
		
		
		/*// Deleting the records by id
		empRepo.deleteById(1);
		System.out.println("Deleted ..");
		*/
		
		/*
		//Fetching the records
		Optional<Employee> optional = empRepo.findById(2);
		
		System.out.println(optional.get());
		*/
		
		/*
		//Fetching Address records
		Optional<Address> addressOpt = addressRepo.findById(3);
		Address address = addressOpt.get();
		System.out.println(address);
		*/
		
		
	}

}
