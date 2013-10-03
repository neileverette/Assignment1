/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	//
	
	// You fill in this part
	public void run(){
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		move();
		putBeeper();
		turnLeft();
		for(i=0; i < 6, i++){
			move();
		}
	}
	
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	
	}

}
