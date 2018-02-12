package com.bjit.training.dao;

import java.util.List;

import com.bjit.training.model.Person;

public interface PersonDao {
	 void add(Person person);
	 List<Person> listPersons();
	}