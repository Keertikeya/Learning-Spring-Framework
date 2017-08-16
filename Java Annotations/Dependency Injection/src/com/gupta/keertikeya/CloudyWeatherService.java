package com.gupta.keertikeya;

import org.springframework.stereotype.Component;

@Component
public class CloudyWeatherService implements WeatherService {

	@Override
	public String getWeather() {
		
		return "Today's forcast is cloudy with a slight chance of rain.";
	}

}
