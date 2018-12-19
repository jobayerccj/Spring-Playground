package com.jobayer.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}
	
	//add an init method
	public void doMyStartupStaff() {
		System.out.println("inside domystartup staffs method");
	}
	
	//add destroy method
	public void doMyCleanupStaff() {
		System.out.println("inside doMyCleanup Staff method");
	}
	
}
