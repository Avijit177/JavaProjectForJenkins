package com.bjit.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.bjit.spring.boot"})
public class SpringBootApp {

 public static void main(String[] args) {
  SpringApplication.run(SpringBootApp.class, args);
 }
}