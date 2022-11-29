package Tests.SymFlowerTests;

import game.Tetromino;
import game.games.SinglePlayerGame;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SinglePlayerGameSymflowerTest {
	@Test
	public void SinglePlayerGame1() {
		SinglePlayerGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		SinglePlayerGame actual = new SinglePlayerGame();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void enqueueTetromino2() {
		SinglePlayerGame s = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino tetromino = null; // TODO This is a fallback value due to incomplete analysis.
		s.enqueueTetromino(tetromino);
	}

	@Test
	public void myGameGo3() {
		SinglePlayerGame s = null; // TODO This is a fallback value due to incomplete analysis.
		s.myGameGo();
	}

	@Test
	public void run4() {
		SinglePlayerGame s = null; // TODO This is a fallback value due to incomplete analysis.
		s.run();
	}
}
