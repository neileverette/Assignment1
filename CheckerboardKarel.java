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
		goUpRow();
		}

	}
	
	// Makes Karel go down a row
	private void goDownRow(){
		while (frontIsClear()){
			move();
			putBeeper();
			
			// Check to see if a wall is in front of Karel
			if(frontIsClear()){
			move();
			}
		}
	}
	
	// Moves Karel up one row
	private void goUpRow(){
		turnLeft();
		move();
		turnLeft();
		
	}
	
}
