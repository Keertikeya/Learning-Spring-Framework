package com.gupta.keertikeya;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String fortunes[] = {"Just do it!", "Never settle!", "Go big or go home!"};
	
	Random rnd = new Random();
	
	@Override
	public String getDailyFortune() {
		
		return fortunes[rnd.nextInt(3)];
	}

}
