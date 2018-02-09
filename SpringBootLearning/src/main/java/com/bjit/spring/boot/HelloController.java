package com.bjit.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

 @RequestMapping("/")
 String home(ModelMap modal) {
  modal.addAttribute("title", "Dear Trainee");
  modal.addAttribute("message", "Welcome to SpringBoot");
  return "hello";
 }
}