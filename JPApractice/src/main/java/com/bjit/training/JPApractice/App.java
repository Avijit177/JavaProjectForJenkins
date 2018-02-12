package com.bjit.training.JPApractice;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bjit.training.model.Person;
import com.bjit.training.service.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	  PersonService personService = context.getBean(PersonService.class);
    	  // Add Persons
    	  personService.add(new Person("Jhon", "Due", "jhon.due@example.com"));
    	  personService.add(new Person("David", "Miller", "david.miller@example.com"));
    	  personService.add(new Person("Jaime", "Peterson", "jaime.peterson@example.com"));
    	  personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
    	  // Get Persons
    	  List<Person> persons = personService.listPersons();
    	  for (Person person : persons) {
    	   System.out.println("Id = " + person.getId());
    	   System.out.println("First Name = " + person.getFirstName());
    	   System.out.println("Last Name = " + person.getLastName());
    	   System.out.println("Email = " + person.getEmail());
    	   System.out.println();
    	  }
    }
}
