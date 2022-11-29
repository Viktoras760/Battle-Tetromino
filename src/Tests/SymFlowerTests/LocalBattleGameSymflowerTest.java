package Tests.SymFlowerTests;

import java.io.PrintWriter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import game.games.LocalBattleGame;

import static org.junit.jupiter.api.Assertions.*;

public class LocalBattleGameSymflowerTest {
	@Test
	public void LocalBattleGame1() {
		String nickName = null; // TODO This is a fallback value due to incomplete analysis.
		String iconPath = null; // TODO This is a fallback value due to incomplete analysis.
		PrintWriter output = null; // TODO This is a fallback value due to incomplete analysis.
		LocalBattleGame expected = null; // TODO This is a fallback value due to incomplete analysis.
		LocalBattleGame actual = new LocalBattleGame(nickName, iconPath, output);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void setupMyGameOverScreen2() {
		LocalBattleGame l = null; // TODO This is a fallback value due to incomplete analysis.
		l.setupMyGameOverScreen();
	}

	@Test
	public void setupMyReadyScreen3() {
		LocalBattleGame l = null; // TODO This is a fallback value due to incomplete analysis.
		l.setupMyReadyScreen();
	}

	@Test
	public void setupOpponentGameOverScreen4() {
		LocalBattleGame l = null; // TODO This is a fallback value due to incomplete analysis.
		l.setupOpponentGameOverScreen();
	}

	@Test
	public void setupOpponentReadyScreen5() {
		LocalBattleGame l = null; // TODO This is a fallback value due to incomplete analysis.
		l.setupOpponentReadyScreen();
	}

	@Test
	public void setupRewardModeScreen6() {
		LocalBattleGame l = null; // TODO This is a fallback value due to incomplete analysis.
		int myLevelScore = 0; // TODO This is a fallback value due to incomplete analysis.
		int opponentLevelScore = 0; // TODO This is a fallback value due to incomplete analysis.
		l.setupRewardModeScreen(myLevelScore, opponentLevelScore);
	}
}
