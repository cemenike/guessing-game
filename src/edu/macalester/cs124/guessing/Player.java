package edu.macalester.cs124.guessing;

public class Player {
	private int guess;

	public void startNewGame() {
		guess = -1;
	}
	
	public int nextGuess() {
		guess++;
		return guess;
	}
	
	public void guessWasLow() {

	}
	
	public void guessWasHigh() {

	}
}
