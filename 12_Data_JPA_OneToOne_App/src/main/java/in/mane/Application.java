package in.mane;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mane.entity.Passport;
import in.mane.entity.Person;
import in.mane.repository.PassportRepository;
import in.mane.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PersonRepository personRepo = context.getBean(PersonRepository.class);
		PassportRepository passportRepo = context.getBean(PassportRepository.class);
		
		/*
		Person person = new Person();
		person.setPersonName("Rahul");
		person.setPersonGender("Male");
		
		Passport passport = new Passport();
		passport.setPassportNum("HF7D8FHH77");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		
		// Setting each entity values
		person.setPassport(passport);
		passport.setPerson(person);
		
		personRepo.save(person);
		//passportRepo.save(passport);
		*/
		
		/*
		// Fetching REcord
		Optional<Person> byId = personRepo.findById(1);
		Person person = byId.get();
		System.out.println(person);
		*/
		
		/*
		// Deleting record
		personRepo.deleteById(1);
		*/
	}

}
