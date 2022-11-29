package Tests.SymFlowerTests;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.gameboards.DoublePlayerGameBoard;

import static org.junit.jupiter.api.Assertions.*;

public class DoublePlayerGameBoardSymflowerTest {
	@Test
	public void DoublePlayerGameBoard1() {
		DoublePlayerGameBoard expected = null; // TODO This is a fallback value due to incomplete analysis.
		DoublePlayerGameBoard actual = new DoublePlayerGameBoard();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void addLinesOnTop2() {
		DoublePlayerGameBoard d = null; // TODO This is a fallback value due to incomplete analysis.
		int lineNum = 0; // TODO This is a fallback value due to incomplete analysis.
		d.addLinesOnTop(lineNum);
	}

	@Test
	public void deployRandomRewardPiece3() {
		DoublePlayerGameBoard d = null; // TODO This is a fallback value due to incomplete analysis.
		Point expected = null; // TODO This is a fallback value due to incomplete analysis.
		Point actual = d.deployRandomRewardPiece();

		assertEquals(expected, actual);
	}

	@Test
	public void deployRewardPiece4() {
		DoublePlayerGameBoard d = null; // TODO This is a fallback value due to incomplete analysis.
		Point expected = null; // TODO This is a fallback value due to incomplete analysis.
		Point actual = d.deployRewardPiece();

		assertEquals(expected, actual);
	}

	@Test
	public void drawPiece5() {
		DoublePlayerGameBoard d = null; // TODO This is a fallback value due to incomplete analysis.
		Graphics g = null; // TODO This is a fallback value due to incomplete analysis.
		d.drawPiece(g);
	}

	@Test
	public void gravityDrop6() {
		DoublePlayerGameBoard d = null; // TODO This is a fallback value due to incomplete analysis.
		d.gravityDrop();
	}
}
