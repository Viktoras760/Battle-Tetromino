package Tests.SymFlowerTests;

import java.io.PrintWriter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.games.OnlineBattleGame;

import static org.junit.jupiter.api.Assertions.*;

public class OnlineBattleGameSymflowerTest {
	@Test
	public void OnlineBattleGame1() {
		String nickName = null; // TODO This is a fallback value due to incomplete analysis.
		String iconPath = null; // TODO This is a fallback value due to incomplete analysis.
		PrintWriter output = null; // TODO This is a fallback value due to incomplete analysis.
		OnlineBattleGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		OnlineBattleGame actual = new OnlineBattleGame(nickName, iconPath, output);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getOpponent2() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		String nickName = null; // TODO This is a fallback value due to incomplete analysis.
		String iconPath = null; // TODO This is a fallback value due to incomplete analysis.
		o.getOpponent(nickName, iconPath);
	}

	@Test
	public void handleOpponent3() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		String command = null; // TODO This is a fallback value due to incomplete analysis.
		String data = null; // TODO This is a fallback value due to incomplete analysis.
		o.handleOpponent(command, data);
	}

	@Test
	public void setupMyGameOverScreen4() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		o.setupMyGameOverScreen();
	}

	@Test
	public void setupMyReadyScreen5() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		o.setupMyReadyScreen();
	}

	@Test
	public void setupOpponentGameOverScreen6() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		o.setupOpponentGameOverScreen();
	}

	@Test
	public void setupOpponentReadyScreen7() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		o.setupOpponentReadyScreen();
	}

	@Test
	public void setupRewardModeScreen8() {
		OnlineBattleGame o = null; // TODO This is a fallback value due to incomplete analysis.
		int myLevelScore = 0; // TODO This is a fallback value due to incomplete analysis.
		int opponentLevelScore = 0; // TODO This is a fallback value due to incomplete analysis.
		o.setupRewardModeScreen(myLevelScore, opponentLevelScore);
	}
}
