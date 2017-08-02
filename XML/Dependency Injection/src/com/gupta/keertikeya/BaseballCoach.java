package com.gupta.keertikeya;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout () {
		return "Go practice!";
	}

	@Override
	public String getDailyFortune() {
		
		return this.fortuneService.getDailyFortune();
	}
}
