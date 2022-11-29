package Tests.SymFlowerTests;

import java.io.PrintWriter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import server.GameRoom;
import server.User;

import static org.junit.jupiter.api.Assertions.*;

public class GameRoomSymflowerTest {
	@Test
	public void GameRoom1() {
		String gameName = null; // TODO This is a fallback value due to incomplete analysis.
		String gameType = null; // TODO This is a fallback value due to incomplete analysis.
		GameRoom expected = null; // TODO This is a fallback value due to incomplete analysis.
		GameRoom actual = new GameRoom(gameName, gameType);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void enterPlayer2() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		User user = null; // TODO This is a fallback value due to incomplete analysis.
		PrintWriter output = null; // TODO This is a fallback value due to incomplete analysis.
		g.enterPlayer(user, output);
	}

	@Test
	public void getGameName3() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = g.getGameName();

		assertEquals(expected, actual);
	}

	@Test
	public void getGameType4() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = g.getGameType();

		assertEquals(expected, actual);
	}

	@Test
	public void getMaxPlayers5() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.getMaxPlayers();

		assertEquals(expected, actual);
	}

	@Test
	public void getPlayersInRoom6() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.getPlayersInRoom();

		assertEquals(expected, actual);
	}

	@Test
	public void handleCommand7() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		User user = null; // TODO This is a fallback value due to incomplete analysis.
		String command = null; // TODO This is a fallback value due to incomplete analysis.
		String data = null; // TODO This is a fallback value due to incomplete analysis.
		g.handleCommand(user, command, data);
	}

	@Test
	public void removeUser8() {
		GameRoom g = null; // TODO This is a fallback value due to incomplete analysis.
		User user = null; // TODO This is a fallback value due to incomplete analysis.
		g.removeUser(user);
	}
}
