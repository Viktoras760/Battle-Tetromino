package Tests.SymFlowerTests;

import java.io.IOException;
import java.io.Reader;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import client.ClientBufferedReader;

import static org.junit.jupiter.api.Assertions.*;

public class ClientBufferedReaderSymflowerTest {
	@Test
	public void ClientBufferedReader1() {
		Reader in = null; // TODO This is a fallback value due to incomplete analysis.
		ClientBufferedReader expected = null; // TODO This is a fallback value due to incomplete analysis.
		ClientBufferedReader actual = new ClientBufferedReader(in);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void readLine2() throws IOException {
		ClientBufferedReader c = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = c.readLine();

		assertEquals(expected, actual);
	}
}
