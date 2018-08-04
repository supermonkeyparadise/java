package com.tronbrain.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	public BaseballCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {

		// use my fortuneService to get a fortune

		return fortuneService.getFortune();
	}
}
