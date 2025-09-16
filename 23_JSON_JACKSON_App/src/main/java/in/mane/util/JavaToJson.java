package in.mane.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import in.mane.binding.Address;
import in.mane.binding.Passenger;

public class JavaToJson {

	public static void main(String[] args) throws Exception, DatabindException, IOException {
		
		Address addr = new Address();
		addr.setCity("Pune");
		addr.setState("Maha");
		addr.setCountry("India");
		
		// Set data in object Format
		Passenger passenger = new Passenger();
		passenger.setName("Raju");
		passenger.setGender("Male");
		passenger.setFrom("Hyd");
		passenger.setTo("Delhi");
		passenger.setAddr(addr);
		
		// 
		/*
		// Convert object data in json format ==> Json Serialization using Jackson API
		ObjectMapper mapper = new ObjectMapper();
		//Write to the file java object
		mapper.writeValue(new File("passenger.json"), passenger);
		
		System.out.println("Converted to Json");
		*/
		// Java Object to Json using Gson API
		Gson gson = new Gson();
		String json = gson.toJson(passenger);
		System.out.println(json);
		System.out.println("Converted to Json using gson()");
		
	}
}
