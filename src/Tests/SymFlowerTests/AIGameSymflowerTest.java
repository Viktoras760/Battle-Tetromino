package Tests.SymFlowerTests;

import java.io.PrintWriter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.games.AIGame;

import static org.junit.jupiter.api.Assertions.*;

public class AIGameSymflowerTest {
	@Test
	public void AIGame1() {
		PrintWriter output = null; // TODO This is a fallback value due to incomplete analysis.
		AIGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		AIGame actual = new AIGame(output);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void AIGameGo2() {
		AIGame a = null; // TODO This is a fallback value due to incomplete analysis.
		a.AIGameGo();
	}

	@Test
	public void run3() {
		AIGame a = null; // TODO This is a fallback value due to incomplete analysis.
		a.run();
	}
}
