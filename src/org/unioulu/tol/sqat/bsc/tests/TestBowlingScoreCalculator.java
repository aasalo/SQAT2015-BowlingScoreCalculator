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

}
