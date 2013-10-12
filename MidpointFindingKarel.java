/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run(){

		// GoDownSide();
		goDownSide();
		//countSteps();
		turnLeft();

	}

	private void goDownSide(){
		
		// Variable to count the steps of Karel
		int steps = 1;
		
		// Move Karel down the side
		while(frontIsClear()){
			move();
			
			// Count the steps that Karel takes
			steps++;	
		}
	}
	
}
