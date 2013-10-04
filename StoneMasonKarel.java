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
		facingDirection();
	}
	
	

	// checks to see if the Karel is facing East or West
	private void facingDirection(){
		if(facingEast()){
			turnLeft();
		}else if (facingWest()){
			turnLeft();
			turnLeft();
		}
	}
	
	// basic move forward function
	private void moveForward(){
		while(frontIsClear()){
			move();
		}
	}

	// checks to see if there is a column
	private void checkColumn(){
		moveForward();
		if(beepersPresent()==false){
			}
	
	}
}
