package com.test.spring.constructorinjection;

public class FortuneService implements Fortune{

	@Override
	public String getFortune() {
		return "Today you will enjoy in work....";		// read from file system, DB, web service
	}
}
