package Tests.SymFlowerTests;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.games.TetrisGame;

import static org.junit.jupiter.api.Assertions.*;

public class TetrisGameSymflowerTest {
	@Test
	public void TetrisGame1() {
		TetrisGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		TetrisGame actual = new TetrisGame();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void checkMyHold2() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.checkMyHold();
	}

	@Test
	public void disposePauseScreen3() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.disposePauseScreen();
	}

	@Test
	public void requestTetromino4() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.requestTetromino();
	}

	@Test
	public void setGameName5() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		String gameName = null; // TODO This is a fallback value due to incomplete analysis.
		t.setGameName(gameName);
	}

	@Test
	public void setupCountDownScreen6() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.setupCountDownScreen();
	}

	@Test
	public void setupMyGameOverScreen7() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.setupMyGameOverScreen();
	}

	@Test
	public void setupMyReadyScreen8() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.setupMyReadyScreen();
	}

	@Test
	public void setupPauseScreen9() {
		TetrisGame t = null; // TODO This is a fallback value due to incomplete analysis.
		t.setupPauseScreen();
	}
}
