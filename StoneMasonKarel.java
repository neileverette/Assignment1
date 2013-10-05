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
	

	// Moves Karel Forward
	private void startMoving(){
		while(frontIsClear()){
			move();
			checkColumn();
		}
		// Once Karel becomes blocked, find out how he's being blocked
		unblockKarel();
	}
	
	// Check for column
	private void checkColumn(){
		if(beepersPresent()==true){	
		}
	}
	
	// Unblock Karel
	private void unblockKarel(){
		if(facingSouth() || facingNorth() ){
			// Checks to see if Karel has blocks on left, top and right
			if (frontIsBlocked() && rightIsBlocked()){
				sequence1();
			}else if(frontIsBlocked()){			
				// Checks to see if Karel is pointing up
				if(facingNorth()){
					sequence2();
					while(frontIsClear()){
						move();
					}
					turnAround();
				// Checks to see if Karel is pointing down
				}else if(facingSouth()){
					sequence3();
				}
			}else if (facingEast() && frontIsBlocked()){
				stop();
			}
		}//startMoving();
		
	}
	
	// Turns Karel around
	private void sequence1(){
		turnAround();
		startMoving();
	}
	// Turns Karel around
	private void sequence2(){
		turnRight();
		move();
		turnLeft();
	}
	// Turns Karel around
	private void sequence3(){
		turnLeft();
		move();
		turnLeft();
		startMoving();
	}

	
	// 

}
