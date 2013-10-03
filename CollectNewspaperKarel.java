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

	}

	
	
// These are my custom methods	
	
	// moves karel to the paper
	private void moveToPaper(){
		
	}
	
	// karel picks up the paper
	private void pickUpPaper(){
		
	}
	
	// karel returns to original location
	private void pickUpPaper(){
		
	}
	
	// method for having Karel move forward a passed number of steps
	private void moveForward(int x){
		for(int i=0; i < x; i++){			
			move();
		}	
	}

	// method for having Karel turn right	
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
