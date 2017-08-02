package com.gupta.keertikeya;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private Integer numberOfBalls;
	private String coachEmail;
	private String teamName;



	// Constructor
	public CricketCoach() {
		
	}
	
	
	
	// Setter for FortuneService
	public void setFortuneService (FortuneService fortuneService) {
		System.out.println("... setting up your fortune");
		this.fortuneService = fortuneService;
	}
	
	// Setter for numberOfBalls
	public void setNumberOfBalls(Integer numberOfBalls) {
		System.out.println("... setting number of balls to bowl.");
		this.numberOfBalls = numberOfBalls;
	}
	
	// Setter for coachEmail
	public void setCoachEmail(String coachEmail) {
		this.coachEmail = coachEmail;
	}

	// Getter for coachEmail
	public String getCoachEmail() {
		return coachEmail;
	}

	// Setter for teamName
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	// Getter for teamName
	public String getTeamName() {
		return teamName;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Bowl " + this.numberOfBalls + " balls.";
	}

	@Override
	public String getDailyFortune() {
		
		return this.fortuneService.getDailyFortune();
	}

}
