package Tests.SymFlowerTests;

import java.io.IOException;
import java.io.Reader;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import server.Server;
import server.User;
import server.Server.ConnectionHandler;
import server.Server.ServerBufferedReader;

import static org.junit.jupiter.api.Assertions.*;

public class ServerSymflowerTest {
	@Test
	public void ConnectionHandler1() {
		User user = null; // TODO This is a fallback value due to incomplete analysis.
		Server.ConnectionHandler expected = null; // TODO This is a fallback value due to incomplete analysis.
		Server outerClass = null; // TODO This is a fallback value due to incomplete analysis.
		Server.ConnectionHandler actual = outerClass.new ConnectionHandler(user);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void run2() {
		Server.ConnectionHandler c = null; // TODO This is a fallback value due to incomplete analysis.
		c.run();
	}

	@Test
	public void Server3() throws IOException {
		Server expected = null; // TODO This is a fallback value due to incomplete analysis.
		Server actual = new Server();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void ServerBufferedReader4() {
		Reader in = null; // TODO This is a fallback value due to incomplete analysis.
		Server.ServerBufferedReader expected = null; // TODO This is a fallback value due to incomplete analysis.
		Server outerClass = null; // TODO This is a fallback value due to incomplete analysis.
		Server.ServerBufferedReader actual = outerClass.new ServerBufferedReader(in);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void readLine5() throws IOException {
		Server.ServerBufferedReader s = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = s.readLine();

		assertEquals(expected, actual);
	}

	@Test
	public void go6() throws IOException {
		Server s = null; // TODO This is a fallback value due to incomplete analysis.
		s.go();
	}

	@Test
	public void main7() throws IOException {
		String[] args = null; // TODO This is a fallback value due to incomplete analysis.
		Server.main(args);
	}
}
