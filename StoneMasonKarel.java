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
//		moveDown();
//		moveOver()
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
		
		// Go to the next row
		moveToNextRow();
	}
	
	// This method fills the column with beepers
	// It first detects if Karel is standing on a beeper
	private void fillColumn(){
		if (beepersPresent()){
			putBeeper();
		}
		move();
		
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
	
}


