package Tests.SymFlowerTests;

import game.Tetromino;
import game.gameboards.AIGameBoard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AIGameBoardSymflowerTest {
	@Test
	public void getHoleNum1() {
		AIGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] map = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = a.getHoleNum(map);

		assertEquals(expected, actual);
	}

	@Test
	public void getSpikiness2() {
		AIGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] map = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = a.getSpikiness(map);

		assertEquals(expected, actual);
	}

	@Test
	public void moveToBestPosition3() {
		AIGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino hold = null; // TODO This is a fallback value due to incomplete analysis.
		a.moveToBestPosition(hold);
	}

	@Test
	public void newTetromino4() {
		AIGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino tetromino = null; // TODO This is a fallback value due to incomplete analysis.
		a.newTetromino(tetromino);
	}
}
