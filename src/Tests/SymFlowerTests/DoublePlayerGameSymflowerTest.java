package Tests.SymFlowerTests;

import game.Tetromino;
import game.games.DoublePlayerGame;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DoublePlayerGameSymflowerTest {
	@Test
	public void DoublePlayerGame1() {
		String nickName = null; // TODO This is a fallback value due to incomplete analysis.
		String iconPath = null; // TODO This is a fallback value due to incomplete analysis.
		DoublePlayerGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		DoublePlayerGame actual = new DoublePlayerGame(nickName, iconPath);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void enqueueTetromino2() {
		DoublePlayerGame d = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino tetromino = null; // TODO This is a fallback value due to incomplete analysis.
		d.enqueueTetromino(tetromino);
	}

	@Test
	public void myGameGo3() {
		DoublePlayerGame d = null; // TODO This is a fallback value due to incomplete analysis.
		d.myGameGo();
	}

	@Test
	public void opponentGameGo4() {
		DoublePlayerGame d = null; // TODO This is a fallback value due to incomplete analysis.
		d.opponentGameGo();
	}

	@Test
	public void run5() {
		DoublePlayerGame d = null; // TODO This is a fallback value due to incomplete analysis.
		d.run();
	}
}
