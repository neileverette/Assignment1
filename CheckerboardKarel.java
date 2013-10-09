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
		goDownRow();
		turnKarelAround();
		}
	
	// Moves Karel down row while dropping beepers
	private void goDownRow(){
		while(frontIsClear()){
			move();
			dropABeeper();
			
			if(frontIsClear()){
				move();
			}
		}
	}
	
	// Makes Karel drop beepers 
	private void dropABeeper(){
		// Check to see if a beeper is present
		if (noBeepersPresent()){
			putBeeper();
		}
	}

	// Turn Karel Around
	private void turnKarelAround(){
		
		// Make Karel go up one row
		goUpARow();
		// Positions Karel in the right/left direction
		orientKarel();

	}
	// Makes Karel go up a row
	private void goUpARow(){
		
		// This checks to see in which direction Karel is heading
		if(facingEast()){
			turnLeft();
		}else{
			turnLeft();
			turnLeft();
			turnLeft();
		}
		
		// This checks to see if a wall is in the way
		if(frontIsClear()){
			move();
		}else{
			stop();
		}
	}

	// Orients Karel in the correct direction
	private void orientKarel(){
		turnLeft();
	}
}
