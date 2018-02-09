package com.bjit.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentWebController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	
	 public String printHello(Model model) {
		  model.addAttribute("message", "Hello Spring MVC Framework!");

		  return "student";
		 }
	
	
	
	
	@RequestMapping(value = "/studentAdd", method = RequestMethod.POST)
	public String showStudent(@ModelAttribute("Student") Student student, Model model)
	{
		System.out.println("hello ");
	 
	        model.addAttribute("name", student.getName());
	        model.addAttribute("id", student.getId());
	        model.addAttribute("age", student.getAge());
	        model.addAttribute("mail", student.getMail());
	        
	        System.out.println(student);
		
		return "show";
	}
	
	@GetMapping("/ajax")
	public String test() {
		//System.out.println("Hello");
		return "Hello";
	}
	

}
