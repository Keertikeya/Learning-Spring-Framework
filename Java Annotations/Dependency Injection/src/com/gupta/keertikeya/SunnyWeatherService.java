package com.gupta.keertikeya;

import org.springframework.stereotype.Component;

@Component
public class SunnyWeatherService implements WeatherService {

	@Override
	public String getWeather() {
		
		return "Today is a bright sunny day!";
	}

}
