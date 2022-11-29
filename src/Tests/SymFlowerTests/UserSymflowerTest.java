package Tests.SymFlowerTests;

import java.net.Socket;
import java.util.ArrayList;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import server.User;

import static org.junit.jupiter.api.Assertions.*;

public class UserSymflowerTest {
	@Test
	public void User1() {
		Socket s = null; // TODO This is a fallback value due to incomplete analysis.
		User expected = null; // TODO This is a fallback value due to incomplete analysis.
		User actual = new User(s);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getNewMessages2() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> expected = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> actual = u.getNewMessages();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getNewMessagesIcon3() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> expected = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> actual = u.getNewMessagesIcon();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getNewMessagesNick4() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> expected = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> actual = u.getNewMessagesNick();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getNewMessagesTime5() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> expected = null; // TODO This is a fallback value due to incomplete analysis.
		ArrayList<String> actual = u.getNewMessagesTime();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getNickName6() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = u.getNickName();

		assertEquals(expected, actual);
	}

	@Test
	public void getUserIconPic7() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = u.getUserIconPic();

		assertEquals(expected, actual);
	}

	@Test
	public void nickName8() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = u.nickName();

		assertEquals(expected, actual);
	}

	@Test
	public void nickName9() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		String nickName = null; // TODO This is a fallback value due to incomplete analysis.
		u.nickName(nickName);
	}

	@Test
	public void setUserIconPic10() {
		User u = null; // TODO This is a fallback value due to incomplete analysis.
		String userIconPic = null; // TODO This is a fallback value due to incomplete analysis.
		u.setUserIconPic(userIconPic);
	}
}
