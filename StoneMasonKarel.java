/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run(){			
		orientKarel();
		moveForward();

	}
	
	// Orients Karel in space
	private void orientKarel(){
		// This handles the initial state of Karel
		if (facingEast() && frontIsClear()){
			turnLeft();
		// This handles the ending position	
		}else if (facingEast() && rightIsBlocked()){
			stop();
		}
	}
	
	// Moves Karel forward
	private void moveForward(){
		
		// Set a boolean for column
		boolean beepers = false;
		
		while(frontIsClear()){
			move();
		}
		// At the end of a row, turn Karel around
		turnAround();
		
		// This sets up 2 paths for Karel, depending on if he encounters beepers
		// First path is for no beepers

		
	}

	
	// This functions is for empty rows
	private void dontLayBeepers(){
		while(frontIsClear()){
			move();
		}
		restartKarel();
	}
	
	// This function is for rows with beepers
	private void layBeepers(){
		// Runs Karel forward
		while(frontIsClear()){
			// If beeper present, skip
			if(beepersPresent()){

			// If beeper not present, lay one down
			}else if(noBeepersPresent()){
				putBeeper();
			}
			// Moves Karel down one
			move();
		}
		
		// Handles the end of the row condition
		if(frontIsBlocked()){
			if(noBeepersPresent()){
				putBeeper();
				restartKarel();
			}else{
				// Move Karel to the next row and start the sequence again
				restartKarel();
			}
		}
	}
	
	// This restarts the sequence of Karel going up a row
	private void restartKarel(){
		turnLeft();
		move();
		turnLeft();
		moveForward();
	}
}


