package Tests.SymFlowerTests;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.Tetromino;

import static org.junit.jupiter.api.Assertions.*;

public class TetrominoSymflowerTest {
	@Test
	public void Tetromino1() {
		char type = 0x0; // TODO This is a fallback value due to incomplete analysis.
		Tetromino expected = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino actual = new Tetromino(type);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void Tetromino2() {
		Tetromino expected = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino actual = new Tetromino();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCurrentShape3() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] expected = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] actual = t.getCurrentShape();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getImg4() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		ImageIcon expected = null; // TODO This is a fallback value due to incomplete analysis.
		ImageIcon actual = t.getImg();

		assertEquals(expected, actual);
	}

	@Test
	public void getNextShape5() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] expected = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] actual = t.getNextShape();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getPhase6() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = t.getPhase();

		assertEquals(expected, actual);
	}

	@Test
	public void getShapes7() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][][] expected = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][][] actual = t.getShapes();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getTetrominoColor8() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		Color expected = null; // TODO This is a fallback value due to incomplete analysis.
		Color actual = t.getTetrominoColor();

		assertEquals(expected, actual);
	}

	@Test
	public void peekNextShape9() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] expected = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] actual = t.peekNextShape();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void setPhase10() {
		Tetromino t = null; // TODO This is a fallback value due to incomplete analysis.
		int phase = 0; // TODO This is a fallback value due to incomplete analysis.
		t.setPhase(phase);
	}
}
