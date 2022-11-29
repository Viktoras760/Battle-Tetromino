package Tests.SymFlowerTests;

import java.io.IOException;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;

import client.TetrominoClient;
import client.WaitLoungeGUI;
import client.WaitLoungeGUI.CompCellEditorRenderer;

import static org.junit.jupiter.api.Assertions.*;

public class WaitLoungeGUISymflowerTest {
	@Test
	public void getCellEditorValue1() {
		WaitLoungeGUI.CompCellEditorRenderer c = null; // TODO This is a fallback value due to incomplete analysis.
		Object expected = null; // TODO This is a fallback value due to incomplete analysis.
		Object actual = c.getCellEditorValue();

		assertEquals(expected, actual);
	}

	@Test
	public void getTableCellEditorComponent2() {
		WaitLoungeGUI.CompCellEditorRenderer c = null; // TODO This is a fallback value due to incomplete analysis.
		JTable table = null; // TODO This is a fallback value due to incomplete analysis.
		Object value = null; // TODO This is a fallback value due to incomplete analysis.
		boolean isSelected = false; // TODO This is a fallback value due to incomplete analysis.
		int row = 0; // TODO This is a fallback value due to incomplete analysis.
		int column = 0; // TODO This is a fallback value due to incomplete analysis.
		Component expected = null; // TODO This is a fallback value due to incomplete analysis.
		Component actual = c.getTableCellEditorComponent(table, value, isSelected, row, column);

		assertEquals(expected, actual);
	}

	@Test
	public void getTableCellRendererComponent3() {
		WaitLoungeGUI.CompCellEditorRenderer c = null; // TODO This is a fallback value due to incomplete analysis.
		JTable table = null; // TODO This is a fallback value due to incomplete analysis.
		Object value = null; // TODO This is a fallback value due to incomplete analysis.
		boolean isSelected = false; // TODO This is a fallback value due to incomplete analysis.
		boolean hasFocus = false; // TODO This is a fallback value due to incomplete analysis.
		int row = 0; // TODO This is a fallback value due to incomplete analysis.
		int column = 0; // TODO This is a fallback value due to incomplete analysis.
		Component expected = null; // TODO This is a fallback value due to incomplete analysis.
		Component actual = c.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		assertEquals(expected, actual);
	}

	@Test
	public void isCellEditable4() {
		WaitLoungeGUI.CompCellEditorRenderer c = null; // TODO This is a fallback value due to incomplete analysis.
		EventObject anEvent = null; // TODO This is a fallback value due to incomplete analysis.
		boolean expected = false; // TODO This is a fallback value due to incomplete analysis.
		boolean actual = c.isCellEditable(anEvent);

		assertEquals(expected, actual);
	}

	@Test
	public void WaitLoungeGUI5() throws IOException {
		TetrominoClient client2 = null; // TODO This is a fallback value due to incomplete analysis.
		WaitLoungeGUI expected = null; // TODO This is a fallback value due to incomplete analysis.
		WaitLoungeGUI actual = new WaitLoungeGUI(client2);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getUpdate6() {
		WaitLoungeGUI w = null; // TODO This is a fallback value due to incomplete analysis.
		w.getUpdate();
	}
}
