package Tests.SymFlowerTests;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import client.LogInGUI;
import client.TetrominoClient;

import static org.junit.jupiter.api.Assertions.*;

public class LogInGUISymflowerTest {
	@Test
	public void LogInGUI1() {
		TetrominoClient client2 = null; // TODO This is a fallback value due to incomplete analysis.
		LogInGUI expected = null; // TODO This is a fallback value due to incomplete analysis.
		LogInGUI actual = new LogInGUI(client2);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}
}
