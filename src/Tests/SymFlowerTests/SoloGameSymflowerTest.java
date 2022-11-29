package Tests.SymFlowerTests;

import java.io.PrintWriter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.games.SoloGame;

import static org.junit.jupiter.api.Assertions.*;

public class SoloGameSymflowerTest {
	@Test
	public void SoloGame1() {
		PrintWriter output = null; // TODO This is a fallback value due to incomplete analysis.
		SoloGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		SoloGame actual = new SoloGame(output);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void run2() {
		SoloGame s = null; // TODO This is a fallback value due to incomplete analysis.
		s.run();
	}
}
