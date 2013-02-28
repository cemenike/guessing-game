package edu.macalester.cs124.guessing;

import acm.util.RandomGenerator;

public class GameMaster {
	public static final int LOW = 1, HIGH = 2, CORRECT = 3;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int keepGuessCount, randomnumber;
	

	public void startNewGame() {
		randomnumber = rgen.nextInt(1,99);
		keepGuessCount=0;
	}
	
	public int submitGuess(int guess) {
		keepGuessCount++;			
		if(guess < randomnumber) {
			return LOW;
		}
		else if(guess == randomnumber) {
			return CORRECT;
		}
		else {
			return HIGH;
		}
	}
	
	public int getGuessCount() {
		return keepGuessCount;
	}



}
