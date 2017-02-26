package com.test.general;

public class MyApp {

	public static void main(String[] args) {

		Coach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theCoach2 = new TrackCoach();			// we are hard coding here 
		System.out.println(theCoach2.getDailyWorkout());
		
	}

}
