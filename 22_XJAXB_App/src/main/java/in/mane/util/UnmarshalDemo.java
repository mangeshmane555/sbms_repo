package in.mane.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.mane.binding.Person;

public class UnmarshalDemo {

	public static void main(String[] args) throws Exception {
		
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object p = unmarshaller.unmarshal(new File("person.xml"));
		
		System.out.println("Unmarshalling done");
		System.out.println(p);
		
	}
	
}
