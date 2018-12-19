package com.jobayer.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside cricket coach");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter cricket coach");
		this.fortuneService = fortuneService;
	}
	
	

	public String getEmailAddress() {
		
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter cricket coach: - email address");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside setter cricket coach: - team");
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice batting for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
