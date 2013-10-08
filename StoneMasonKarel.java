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
		moveToNextRow();
	}
	
	// This section contains the referenced methods
	
	// This will turn Karel up to start the sequence
	private void turnKarelUp(){
		turnLeft();
	}
	
	// This will check to see if the row is a "column"
	private void columnCheck(){
		moveKarelUp();
	}

	// Moves Karel up a column
	private void moveKarelUp(){
		
		// Set the intial value of column to No/False
		boolean column = false;
		
		// Checks to make sure there are no walls in front of Karel
		while(frontIsClear()){
			
			// Check to see if a beeper is present
			if(beepersPresent()){
				column = true;
			}
			move();
		}
		// This chooses the path down to either just move down, or to fill the row with beepers
		if(column = true){
			turnKarelAround();
			fillColumn();
		}else{
			moveToBottom();
		}
	}
	
	// Turn Karel around 180 degrees
	private void turnKarelAround(){
		turnLeft();
		turnLeft();
	}
	
	// This fills in the missing gap of identified columns
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
		
		if(frontIsClear()){
			move();
			turnLeft();
		}
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


