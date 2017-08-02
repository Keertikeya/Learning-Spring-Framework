package com.gupta.keertikeya;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout () {
		return "Go run!";
	}

	@Override
	public String getDailyFortune() {
		
		return this.fortuneService.getDailyFortune();
	}
}
