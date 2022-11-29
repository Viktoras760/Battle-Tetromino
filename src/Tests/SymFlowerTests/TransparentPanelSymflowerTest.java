package Tests.SymFlowerTests;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.TransparentPanel;

import static org.junit.jupiter.api.Assertions.*;

public class TransparentPanelSymflowerTest {
	@Test
	public void TransparentPanel1() {
		TransparentPanel expected = null; // TODO This is a fallback value due to incomplete analysis.
		TransparentPanel actual = new TransparentPanel();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void addCenterMessage2() {
		TransparentPanel t = null; // TODO This is a fallback value due to incomplete analysis.
		String message = null; // TODO This is a fallback value due to incomplete analysis.
		t.addCenterMessage(message);
	}

	@Test
	public void addSmallMessage3() {
		TransparentPanel t = null; // TODO This is a fallback value due to incomplete analysis.
		String message = null; // TODO This is a fallback value due to incomplete analysis.
		t.addSmallMessage(message);
	}

	@Test
	public void countdown4() {
		TransparentPanel t = null; // TODO This is a fallback value due to incomplete analysis.
		int countdown = 0; // TODO This is a fallback value due to incomplete analysis.
		t.countdown(countdown);
	}

	@Test
	public void gameOver5() {
		TransparentPanel t = null; // TODO This is a fallback value due to incomplete analysis.
		String message = null; // TODO This is a fallback value due to incomplete analysis.
		int score = 0; // TODO This is a fallback value due to incomplete analysis.
		int lines = 0; // TODO This is a fallback value due to incomplete analysis.
		int levels = 0; // TODO This is a fallback value due to incomplete analysis.
		boolean keyClose = false; // TODO This is a fallback value due to incomplete analysis.
		String[][] highest = null; // TODO This is a fallback value due to incomplete analysis.
		t.gameOver(message, score, lines, levels, keyClose, highest);
	}

	@Test
	public void paintComponent6() {
		TransparentPanel t = null; // TODO This is a fallback value due to incomplete analysis.
		Graphics g = null; // TODO This is a fallback value due to incomplete analysis.
		t.paintComponent(g);
	}

	@Test
	public void setRandomBgColor7() {
		TransparentPanel t = null; // TODO This is a fallback value due to incomplete analysis.
		t.setRandomBgColor();
	}
}
