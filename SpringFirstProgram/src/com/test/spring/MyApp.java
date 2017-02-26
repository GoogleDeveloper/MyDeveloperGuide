package com.test.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter game name (baseballCoach or trackCoach): ");
		String name = scan.next();
		
		Coach theCoach = context.getBean(name, Coach.class);		
		// checks in configuration "baseballbean" and interface of "baseball" class. (When we pass the interface to the method, behind the scenes Spring will cast the object for you.)
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
