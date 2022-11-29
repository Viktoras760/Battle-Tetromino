package Tests.SymFlowerTests;

import org.junit.jupiter.api.*;

import game.gameboards.AIDoublePlayerGameBoard;

import static org.junit.jupiter.api.Assertions.*;

public class AIDoublePlayerGameBoardSymflowerTest {
	@Test
	public void addLinesOnTop1() {
		AIDoublePlayerGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		int lineNum = 0; // TODO This is a fallback value due to incomplete analysis.
		a.addLinesOnTop(lineNum);
	}

	@Test
	public void deployRewardPiece2() {
		AIDoublePlayerGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		Point expected = null; // TODO This is a fallback value due to incomplete analysis.
		Point actual = a.deployRewardPiece();

		assertEquals(expected, actual);
	}

	@Test
	public void drawPiece3() {
		AIDoublePlayerGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		Graphics g = null; // TODO This is a fallback value due to incomplete analysis.
		a.drawPiece(g);
	}

	@Test
	public void gravityDrop4() {
		AIDoublePlayerGameBoard a = null; // TODO This is a fallback value due to incomplete analysis.
		a.gravityDrop();
	}
}
