package com.test.spring.constructorinjection;

public class BaseballCoach implements Coach{
	
	private Fortune fortune;
	public BaseballCoach(Fortune fortune)
	{
		this.fortune=fortune;
	}
	public String getDailyFortune()			//dependency
	{
		return fortune.getFortune();
	}
	public String getDailyWorkout()
	{
		return "BaseballCoach: practice batting for 30 minutes....";
	}
	
	
}
