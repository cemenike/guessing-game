package edu.macalester.cs124.guessing;

import acm.util.RandomGenerator;

public class GameMaster {
	public static final int LOW = 1, HIGH = 2, CORRECT = 3;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public int KeepGuessCount, result, randomnumber;
	

	public void startNewGame() {
		randomnumber = rgen.nextInt(1,99);
		System.out.println(randomnumber);
		
	}
	
	public int submitGuess(int guess) {
		boolean count = false;
			while(count == false) {
				KeepGuessCount++;			
				if(guess < randomnumber) {
					result = 1;
					count = false;

				}
				else if(guess == randomnumber) {
					result = 3;
					count = true;

				}
				else {
					result = 2;
					count = false;

				}
			}
			return result;
	}
	
	public int getGuessCount() {
		return KeepGuessCount;
	}



}
