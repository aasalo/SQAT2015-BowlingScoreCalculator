package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	public List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		
		score = 
		
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
