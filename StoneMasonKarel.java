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
		startMoving();
	}
	
	// Checks to see if Karel is in the proper direction
	private void facingDirection(){
		if(facingEast()){
			turnLeft();
		}else if (facingWest()){
			turnLeft();
			turnLeft();
		}
	}
	
	// Moves Karel up and down the grid
	private void startMoving(){
		
		// Move Karel forward as long as he's clear
		while(frontIsClear()){
			move();
			checkColumn();
		}
		
		// Checks to see if Karel has blocks on left, top and right
		if (frontIsBlocked() && rightIsBlocked()){
			turnAround();
			startMoving();
		}
		
		
		if(frontIsBlocked()){			
			// Checks to see if Karel is pointing up
			if(facingNorth()){
				turnRight();
				move();
				turnLeft();
				while(frontIsClear()){
					move();
				}
				turnAround();
				startMoving();
				
			// Checks to see if Karel is pointing down
			}else if(facingSouth()){
				turnLeft();
				move();
				turnLeft();
				startMoving();
			}
	
		}
	}

	// Check for column
	private void checkColumn(){
		if(beepersPresent()==true){
			
		}
	}
	
	// basic move forward function
	private void moveForward(){
		while(frontIsClear()){
			move();
		}
	}

}
