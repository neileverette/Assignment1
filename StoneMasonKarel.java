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
		turnKarelUp();
		columnCheck();
//		moveOver();
	}
	
	// This will turn Karel up to start the sequence
	private void turnKarelUp(){
		turnLeft();
	}
	
	// This will check to see if the row is a "column"
	private void columnCheck(){
		
		// This sets the row to be initially for a column
		boolean column = false;
		
		//Check to see if these is a wall in front of Karel
		while (frontIsClear()){
			
			// Check to see if Karel is on a beeper
			if (beepersPresent()){
				column = true;
			}
			// Move Karel one square up
			move();			
		}

		
		// This section of code runs once Karel hits the end of the row
		
		// When Karel hits the end of the wall move down
		// There are two paths
		// Path A if the row is a "column"
		// Path B if the row is not a "column"
	
			
		// Path A = Fill the column with Beepers
		if (column = true){
			fillColumn();
		}
		
		
		// Path B = Move Karel down to the bottom
		if (column = false){
			moveToBottom();
		}
		
		// Move Karel to the next row
		moveToNextRow();
	}
	
	// Turn Karel around 180 degrees
	private void turnKarelAround(){
		turnLeft();
		turnLeft();
	}
	
	
	// This method fills the column with beepers
	// It first detects if Karel is standing on a beeper
	private void fillColumn(){
		
		// Move Karel down to the bottom of the screen
		while (frontIsClear()){
			
			// This checks to see if a beeper is present
			// If Karel is not on a beeper, it moves puts beeper
			if (noBeepersPresent()){
				putBeeper();
			}
			move();
			
			// This handles the end of the line issue if the last block of the row is empty
			// If the last block in the row is empty, Karel places a block before moving to the next row
			if (noBeepersPresent()){
				putBeeper();
			}
		}
	}
	
	// This method simply moves Karel down to the bottom of the row
	private void moveToBottom(){
		while (frontIsClear()){
			move();
		}
	}
	
	// This move Karel to the next row
	private void moveToNextRow(){
		turnLeft();
		move();
		turnLeft();
	}
	
	// This will move Karel over a row
	private void moveOver(){
		// Turn Karel around
		turnKarelAround();
		
		// Check to see if Karel is at the end of all the rows
		// If there is no wall in front of Karel, have him move forward
		if (frontIsClear()){
			move();
		}else{
			// If Karel is at the end, stop him
			stop();
		}
		
	}
	

}


