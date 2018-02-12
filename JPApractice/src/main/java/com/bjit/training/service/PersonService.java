package com.bjit.training.service;

import java.util.List;

import com.bjit.training.model.Person;

public interface PersonService {
	
	public void add(Person person);
	public List<Person> listPersons();

}
