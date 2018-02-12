package com.bjit.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;


@Entity
@Table(name = "persons")

@Data
@ToString

public class Person {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @Column(name = "first_name")
 private String firstName;
 
 @Column(name = "last_name")
 private String lastName;
 
 @Column(name = "email")
 private String email;
 
 
 public Person() { }
 
 public Person(String firstName, String lastName, String email) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
 } 
 
 
 
}



