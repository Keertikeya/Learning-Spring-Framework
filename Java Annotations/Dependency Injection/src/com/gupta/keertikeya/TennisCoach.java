package com.gupta.keertikeya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	private WeatherService weatherService;
	
	@Autowired
	private FortuneService anotherFortuneService;
	
	@Autowired
	public TennisCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	@Qualifier("sunnyWeatherService")
	public void setWeatherService (WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice serving";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWeather() {
		
		return weatherService.getWeather();
	}
	
	@Override
	public String getAnotherFortuneService() {
		
		return ("Repeating your fortune: " + anotherFortuneService.getFortune());
	}

}
