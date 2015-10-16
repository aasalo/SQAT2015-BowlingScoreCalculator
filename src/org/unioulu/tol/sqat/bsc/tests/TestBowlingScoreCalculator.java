package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testSingleFramePlayed() {
		//Arrange
		BowlingGame game = new BowlingGame();
		
		int throw1 = 2;
		int throw2 = 4;
		
		//Act
		Frame frame = new Frame(throw1, throw2);
		game.addFrame(frame);
		//Assert
		assertEquals(1, game.frames.size());
	}
	
	@Test
	public void testComputeScoreOfaFrame(){
		//Arrange
		//BowlingGame game = new BowlingGame();
		
		int throw1 = 2;
		int throw2 = 4;
		
		//Act
		Frame frame = new Frame(throw1, throw2);
		frame.score();
		
		//Assert
		assertEquals(6, frame.score());
		
	}
	
	@Test
	public void testGameWithTenFrames(){
		//Arrange
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(1, 5);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		//Act
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		
		//Assert
		assertEquals(10, game.frames.size());
	}
	
	@Test
	public void testComputeGameScore(){
		//Arrange
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(1, 5);
		Frame frame2 = new Frame(3, 6);
		Frame frame3 = new Frame(7, 2);
		Frame frame4 = new Frame(3, 6);
		Frame frame5 = new Frame(4, 4);
		Frame frame6 = new Frame(5, 3);
		Frame frame7 = new Frame(3, 3);
		Frame frame8 = new Frame(4, 5);
		Frame frame9 = new Frame(8, 1);
		Frame frame10 = new Frame(2, 6);
		
		//Act
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		
		//Assert
		assertEquals(81, game.score());
		
	}
	
	@Test
	public void testIfStrikeIsRecognized(){
		
		BowlingGame game = new BowlingGame();
		
		Frame frame1 = new Frame(10,0);
		
		assertEquals(true, frame1.isStrike());
	}
}
