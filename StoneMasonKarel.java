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
		moveDown();
//		moveOver()
	}
	
	// This will turn Karel up to start the sequence
	private void turnKarelUp(){
		turnLeft();
	}
	
	// This will check to see if the row is a "column"
	private void columnCheck(){
		//Check to see if these is a wall in front of Karel
		while (frontIsClear()){
			move();
		}
	}
	
}


