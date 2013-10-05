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

	}
	
	// Orients Karel on initiation
	private void orientKarel(){
		if (facingEast()){
			turnLeft();
		}	
	}
	
	// Moves Karel forward
	private void moveForward(){
		while(frontIsClear()){
			move();
		}
	}
}
