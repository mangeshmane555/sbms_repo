package in.mane.util;

import java.io.File;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import in.mane.binding.Passenger;

public class JsonToJava {

	public static void main(String[] args) throws Exception  {
		
		// Using Jackson API
		/*
		ObjectMapper mapper = new ObjectMapper();
		// Read from file and convert to java object ==> De-Serialization
		Passenger passengerObj = mapper.readValue(new File("passenger.json"), Passenger.class);
		System.out.println(passengerObj);
		*/
		// Using Gson API
		Gson gson = new Gson();
		Passenger p = gson.fromJson(new FileReader("passenger.json"), Passenger.class);
		System.out.println(p);
		
	}
	
}
