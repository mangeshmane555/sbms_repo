package in.mane.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.mane.binding.Address;
import in.mane.binding.Person;

// Masrshalling 
public class MarshallDemo {
	
	public static void main(String[] args) throws Exception {
		
		Address addr = new Address();
		addr.setCity("Pune");
		addr.setState("Maha");
		addr.setCountry("India");
		
		Person p = new Person();
		p.setId(101);
		p.setName("Mane");
		p.setGender("Male");
		p.setEmail("mm@gmail.com");
		p.setAddr(addr);
		
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(p, new File("person.xml")); 
		
		System.out.println("Done");
		
		
	}
	
	//Unmasrshalling

	
	
}
