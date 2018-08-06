package com.tronbrain.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	
    /*
    @Autowired 
    public TennisCoach(FortuneService theFortuneService) {
    	this.fortuneService = theFortuneService;
    }
    */
	 

	// define a setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}
	*/
	
	// define a setter method
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
