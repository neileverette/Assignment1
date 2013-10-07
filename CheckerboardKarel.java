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
		putBeepersInMiddle();
		returnKarelToStart();
		moveToBeepers();
		doubleBeepers();
//		returnKarelToStart();
	}
	
	// This section sets up the conditions needed to start the program
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

	
	
	// This portion of the code is the real program
	// Move Karel to the pile of beepers
	private void moveToBeepers(){
		
		// Move forward if the front is clear
		while(noBeepersPresent()){
			move();
			}
	}

	// Method to double the beepers in the original pile
	private void doubleBeepers(){
		while(beepersPresent()){
		pickUpBeepers();
		putTwoNextSquare();
		returnToPile();
		}
		putBeepersBack();
	}
		
	// Tells Karel to pick up a beeper from the middle pile if beepers exist
	private void pickUpBeepers(){
		pickBeeper();
	}

	// Puts 2 beepers down for every 1 picked up
	private void putTwoNextSquare(){
		move();
		putDownBeeper();
	}
	
	// Enables Karen to put down 2 beepers 
	private void putDownBeeper(){
		for (int i = 0; i < 2; i++){
			putBeeper();
		}
	}

	// Returns Karel to the original pile
	private void returnToPile(){
		turnKarelAround();
		move();
		turnKarelAround();
	}
	
	// Puts all the beepers back to the original pile
	private void putBeepersBack(){
		// Move Karel to the pile of beepers to the right of the original pile
		move();
		
		while(beepersPresent()){
			turnKarelAround();
			pickBeeper();
			move();
			putBeeper();
			returnToPile();
		}
	}

}
