/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){
		
		// Start by adding 4 beepers to the middle of the square
		putBeepersInMiddle();
		
		// Then return Karel to home
		
		
	}
	
	
	// Adds 4 beepers to the middle of the square
	private void putBeepersInMiddle(){
		// Move Karel over 4 spots to the right
		for(int i = 0; i < 4; i++ ){
			move();
		}
		// Drop 4 beepers
		for(int j = 0; j < 4; j++ ){
			putBeeper();
		}
	}

	// Returns Karel to original starting point
	private void returnKarelToStart(){
		turnKarelAround();
		moveToStartingPoint();
		turnKarelAround();
	}
	
	// Turns Karel around
	private void turnKarelAround(){
		turnLeft();
		turnLeft();
	}
	
	// Moves Karel to the original starting point
	private void moveToStartingPoint(){
		while(frontIsClear()){
			move();
		}
	}
}
