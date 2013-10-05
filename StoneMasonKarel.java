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
		boolean beepers = false;
		
		
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
		while(frontIsClear()){
			move();
		}
		
	}

	// Check for beepers
	private void checkForBeepers(){
		if (beepersPresent()){
			boolean beepers = true;
			return beepers;
		}
	}
	
	// Turns Karel around
	private void turnKarelAround(){
		
	}
}


