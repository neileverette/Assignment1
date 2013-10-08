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
		
		while(frontIsClear()){
		goDownRow();
		goUpRowRight();
		goDownRow();
		goUpRowLeft();
		}

	}
	
	// Makes Karel go down a row
	private void goDownRow(){
		
		// Move down the row and put beepers down at every other square
		while (frontIsClear()){
			move();
			putDownBeeper();
			
			// Check to see if a wall is in front of Karel
			if(frontIsClear()){
			move();
			}
		}
	}
	
	// Moves Karel up one row at the end of a right row
	private void goUpRowRight(){
		turnLeft();
		
		// Check to see if wall is in front of Karel
		if(frontIsClear()){
			move();
		}
		turnLeft();
	}
	
	// Moves Karel up one row at the end of a left row
	private void goUpRowLeft(){
		flipKarel();
		
		// Check to see if wall is in front of Karel
		if(frontIsClear()){
			move();
		}
		
		flipKarel();
	}
	
	// Flip Karel around 180 degrees
	private void flipKarel(){
		turnLeft();
		turnLeft();
		turnLeft();
	}

	// Put down a beeper if one isn't present
	private void putDownBeeper(){
		// Check to see if beeper is on square
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}
