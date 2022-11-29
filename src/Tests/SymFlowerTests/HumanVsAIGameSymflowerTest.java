package Tests.SymFlowerTests;

import java.io.PrintWriter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.games.HumanVsAIGame;

import static org.junit.jupiter.api.Assertions.*;

public class HumanVsAIGameSymflowerTest {
	@Test
	public void AIGameGo1() {
		HumanVsAIGame h = null; // TODO This is a fallback value due to incomplete analysis.
		h.AIGameGo();
	}

	@Test
	public void HumanVsAIGame2() {
		String nickName = null; // TODO This is a fallback value due to incomplete analysis.
		String iconPath = null; // TODO This is a fallback value due to incomplete analysis.
		PrintWriter output = null; // TODO This is a fallback value due to incomplete analysis.
		HumanVsAIGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		HumanVsAIGame actual = new HumanVsAIGame(nickName, iconPath, output);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void setupMyGameOverScreen3() {
		HumanVsAIGame h = null; // TODO This is a fallback value due to incomplete analysis.
		h.setupMyGameOverScreen();
	}

	@Test
	public void setupMyReadyScreen4() {
		HumanVsAIGame h = null; // TODO This is a fallback value due to incomplete analysis.
		h.setupMyReadyScreen();
	}

	@Test
	public void setupOpponentGameOverScreen5() {
		HumanVsAIGame h = null; // TODO This is a fallback value due to incomplete analysis.
		h.setupOpponentGameOverScreen();
	}

	@Test
	public void setupOpponentReadyScreen6() {
		HumanVsAIGame h = null; // TODO This is a fallback value due to incomplete analysis.
		h.setupOpponentReadyScreen();
	}

	@Test
	public void setupRewardModeScreen7() {
		HumanVsAIGame h = null; // TODO This is a fallback value due to incomplete analysis.
		int myLevelScore = 0; // TODO This is a fallback value due to incomplete analysis.
		int opponentLevelScore = 0; // TODO This is a fallback value due to incomplete analysis.
		h.setupRewardModeScreen(myLevelScore, opponentLevelScore);
	}
}
