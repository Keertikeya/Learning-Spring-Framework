package com.gupta.keertikeya;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today's your lucky day!";
	}

}
