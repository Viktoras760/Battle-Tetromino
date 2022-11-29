package game.gameboards;

import game.Tetromino;
import java.awt.*;

import static org.junit.Assert.*;

//import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.*;
//import static org.junit.jupiter.api.Assertions.*;

public class GameBoardSymflowerTest{

	public boolean[][] map = new boolean[14][25];
    public boolean[][] disappearable = new boolean[14][25];
    public boolean[][] movable = new boolean[14][25];
    public Color[][] colors = new Color[14][25];

    public int piecePositionX, piecePositionY;

    public Tetromino current;

    public boolean getHoldSwitch(){
        return holdSwitch;
    }

    public boolean holdSwitch = false;


	/*@Test
	public void GameBoard1() {
		GameBoard expected = null; // TODO This is a fallback value due to incomplete analysis.
		GameBoard actual = new GameBoard();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}*/

	@Test
	public void checkDisapperance2() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.checkDisapperance();

		assertEquals(expected, actual);
	}

	@Test
	public void drawPiece3() {
		GameBoard g2 = null; // TODO This is a fallback value due to incomplete analysis.
		Graphics g = null; // TODO This is a fallback value due to incomplete analysis.
		g2.drawPiece(g);
	}

	@Test
	public void gameOver4() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		boolean expected = false; // TODO This is a fallback value due to incomplete analysis.
		boolean actual = g.gameOver();

		assertEquals(expected, actual);
	}

	@Test
	public void getHeight5() {
		GameBoard g = new GameBoard(); // TODO This is a fallback value due to incomplete analysis.
		//boolean[][] map = null; // TODO This is a fallback value due to incomplete analysis.
		int left = 1; // TODO This is a fallback value due to incomplete analysis.
		int right = 1; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.getHeight(map, left, right);

		assertEquals(expected, actual);
	}

	@Test
	public void getHeight6() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		boolean[][] map = null; // TODO This is a fallback value due to incomplete analysis.
		int column = 0; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.getHeight(map, column);

		assertEquals(expected, actual);
	}

	@Test
	public void getHoldSwitch7() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		boolean expected = false; // TODO This is a fallback value due to incomplete analysis.
		boolean actual = g.getHoldSwitch();

		assertEquals(expected, actual);
	}

	@Test
	public void isAtBottom8() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		boolean expected = false; // TODO This is a fallback value due to incomplete analysis.
		boolean actual = g.isAtBottom();

		assertEquals(expected, actual);
	}

	@Test
	public void move9() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		int direction = 0; // TODO This is a fallback value due to incomplete analysis.
		g.move(direction);
	}

	@Test
	public void moveDown10() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		g.moveDown();
	}

	@Test
	public void moveToBottomUp211() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.moveToBottomUp2();

		assertEquals(expected, actual);
	}

	@Test
	public void newTetromino12() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino tetromino = null; // TODO This is a fallback value due to incomplete analysis.
		g.newTetromino(tetromino);
	}

	@Test
	public void paintComponent13() {
		GameBoard g2 = null; // TODO This is a fallback value due to incomplete analysis.
		Graphics g = null; // TODO This is a fallback value due to incomplete analysis.
		g2.paintComponent(g);
	}

	@Test
	public void replace14() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		Tetromino tetromino = null; // TODO This is a fallback value due to incomplete analysis.
		g.replace(tetromino);
	}

	@Test
	public void rotate15() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		g.rotate();
	}

	@Test
	public void rotatePossible16() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		int expected = 0; // TODO This is a fallback value due to incomplete analysis.
		int actual = g.rotatePossible();

		assertEquals(expected, actual);
	}

	@Test
	public void solidifyTetromino17() {
		GameBoard g = null; // TODO This is a fallback value due to incomplete analysis.
		g.solidifyTetromino();
	}
}
