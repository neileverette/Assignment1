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
		
		// Set a variable to count the length of the square
		int length=1;
		
		// Go down the length of the square
		while (frontIsClear()){
			move();
			length++;
		}
			
		// After Karel goes down a side, turn around so that he can put down the beeper
		turnKarelAround();
		
		// Set a variable for the square mid point
		int midpoint = length/2;
		
		// Move Karel to the middle of the square
		for(int i=0; i< midpoint; i++){
			move();
		}
		
		// Drop a beeper
		putBeeper();
		
		// Turn Karel back around
		turnKarelAround();
		
	}

	
	private void turnKarelAround(){
		turnLeft();
		turnLeft();
	}

}
