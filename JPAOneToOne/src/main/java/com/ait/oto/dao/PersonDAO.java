package com.ait.oto.dao;

import com.ait.oto.entities.Person;

public interface PersonDAO 
{	
	void savePerson(Person person);
	
	Person findPerson(Person personId);
	
	void removePerson(Integer personId);
}
