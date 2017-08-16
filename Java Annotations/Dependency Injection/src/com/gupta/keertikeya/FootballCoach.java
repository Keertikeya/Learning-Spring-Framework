package com.gupta.keertikeya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	private WeatherService weatherService;
	
	@Autowired
	public FootballCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	@Qualifier("cloudyWeatherService")
	public void setWeatherService (WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run 50 laps of the ground.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWeather() {
		
		return weatherService.getWeather();
	}

	@Override
	public String getAnotherFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}

}
