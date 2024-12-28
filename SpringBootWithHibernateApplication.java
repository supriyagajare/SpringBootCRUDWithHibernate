package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Entity.User;

import Repository.DbOperations;

@SpringBootApplication(scanBasePackages = {"com.example", "Repository", "config"})
public class SpringBootWithHibernateApplication {

	public static void main(String[] args) 
	{
		 ApplicationContext context = SpringApplication.run(SpringBootWithHibernateApplication.class, args);
		 DbOperations dbop = context.getBean(DbOperations.class, 1L);
		 User us = dbop.getUserDetails(1L);
		 
		 if(us != null)
		 {
			System.out.println(us.getName());
			System.out.println(us.getEmail());
			System.out.println(us.getGender());
			System.out.println(us.getPassword());
			System.out.println(us.getGender());
			System.out.println(us.getCity());
		 }
		 else
		 {
			 System.out.println("User not found");
		 }
	}
}