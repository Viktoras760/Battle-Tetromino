package client;

import javax.swing.*;

import java.awt.*;

public class GameBoard extends JPanel {
    private boolean[][] map = new boolean[14][25];
    private boolean[][] disappearable = new boolean[14][25];
    private boolean[][] movable = new boolean[14][25];
    private Color[][] colors = new Color[14][25];

    public void display() {
        for (int i = 20; i > 0; i--) {
            for (int j = 1; j < 13; j++) {
                if (movable[j][i]) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    private int score, lines = 0;
    private Tetromino current, hold, next1, next2, next3;

    public int piecePositionX, piecePositionY;

    public GameBoard() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 25; j++) {
                this.map[i][j] = (i == 0) || (i == 13) || (j == 0);
                this.disappearable[i][j] = !((i == 0) || (i == 13) || (j == 0));
                this.movable[i][j] = false;
                this.colors[i][j] = null;
            }
        }

        this.score = 0;
        this.lines = 0;
    }

    /**
     * move the controlled tetromino laterally
     *
     * @param direction the direction to move the tetromino, negative to the left and positive to the right
     */
    public void move(int direction) {
        if (direction == 0) {
            return;
        }
        if (this.movePossible(direction)) {
            int[] columns = direction < 0 ? new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12} : new int[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            for (int i : columns) {
                for (int j = 1; j < 25; j++) {
                    if (this.movable[i][j]) {
                        this.map[i + direction][j] = this.map[i][j];
                        this.movable[i + direction][j] = this.movable[i][j];
                        this.colors[i + direction][j] = this.colors[i][j];

                        this.map[i][j] = false;
                        this.movable[i][j] = false;
                        this.colors[i][j] = null;
                    }
                }
            }
            this.piecePositionX += direction;
        }
        repaint();
    }

    /**
     * move the tetromino down by one unit
     */
    public void moveDown() {
        if (!this.isAtBottom()) {
            for (int j = 1; j < 25; j++) {
                for (int i = 1; i < 13; i++) {
                    if (this.movable[i][j]) {
                        this.map[i][j - 1] = this.map[i][j];
                        this.movable[i][j - 1] = this.movable[i][j];
                        this.colors[i][j - 1] = this.colors[i][j];

                        this.map[i][j] = false;
                        this.movable[i][j] = false;
                        this.colors[i][j] = null;

                    }
                }
            }
        }
        this.piecePositionY--;
        repaint();
    }

    public void rotate() {
        int movement = this.rotatePossible();

        if (movement != -9999) {
            for (int y = 0; y < 25; y++) {
                for (int x = 1; x < 13; x++) {
                    if (movable[x][y]) {
                        this.map[x][y] = false;
                        this.movable[x][y] = false;
                        this.colors[x][y] = null;
                    }
                }
            }
            boolean[][] shape = this.current.getNextShape();
            this.piecePositionX += movement;
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (shape[x][y]) {
                        this.map[this.piecePositionX + x][this.piecePositionY + y] = true;
                        this.movable[this.piecePositionX + x][this.piecePositionY + y] = true;
                        this.colors[this.piecePositionX + x][this.piecePositionY + y] = this.current.getTetrominoColor();
                    }
                }
            }
        }
        repaint();
    }

    private boolean movePossible(int direction) {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 25; j++) {
                if (this.movable[i][j]) {
                    if (this.map[i + direction][j] && !this.movable[i + direction][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private int rotatePossible() {
        int pieceX;
        boolean returnable;
        for (int i = 0; i < 4; i++) {
            pieceX = this.piecePositionX + i;
            returnable = true;
            outerLoop:
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    System.out.println(pieceX + " " + this.piecePositionY);
                    try {
                        if (this.current.peekNextShape()[x][y] && (!this.movable[pieceX + x][this.piecePositionY + y] && this.map[pieceX + x][this.piecePositionY + y])) {
                            returnable = false;
                            break outerLoop;
                        }
                    } catch (ArrayIndexOutOfBoundsException e){
                        returnable = false;
                        break outerLoop;
                    }
                }
            }
            if (returnable) {
                return i;
            }

            pieceX = this.piecePositionX - i;
            returnable = true;
            outerLoop:
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (this.current.peekNextShape()[x][y] && (!this.movable[pieceX + x][this.piecePositionY + y] && this.map[pieceX + x][this.piecePositionY + y])) {
                        returnable = false;
                        break outerLoop;
                    }
                }
            }
            if (returnable) {
                return -i;
            }
        }
        return -9999;
    }

    public boolean isAtBottom() {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 25; j++) {
                if (this.movable[i][j]) {
                    if (this.map[i][j - 1] && !this.movable[i][j - 1]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void solidifyTetromino() {
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 13; j++) {
                this.movable[j][i] = false;
            }
        }
        repaint();
    }

    public int checkDisapperance() {
        int rowDisappered = 0;
        boolean disappear;
        for (int i = 1; i < 21; i++) {
            disappear = true;
            for (int j = 1; j < 13; j++) {
                if (this.disappearable[j][i] && !this.map[j][i]) {
                    disappear = false;
                    break;
                }
            }
            if (disappear) {
                for (int y = i; y < 21; y++) {
                    for (int x = 1; x < 13; x++) {
                        if (this.disappearable[x][y]) {
                            if (this.disappearable[x][y + 1]) {
                                this.map[x][y] = this.map[x][y + 1];
                                this.colors[x][y] = this.colors[x][y + 1];
                            } else {
                                this.map[x][y] = false;
                                this.colors[x][y] = null;
                            }
                        }
                    }
                }
                i--;
                rowDisappered++;
            }
        }
        repaint();
        return rowDisappered;
    }

    public void newTetromino(Tetromino tetromino) {
        this.current = tetromino;
        piecePositionX = 5;
        piecePositionY = 21;

        int pieceX, pieceY;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (tetromino.getCurrentShape()[x][y]) {
                    pieceX = piecePositionX + x;
                    pieceY = piecePositionY + y;

                    this.map[pieceX][pieceY] = true;
                    this.movable[pieceX][pieceY] = true;
                    this.colors[pieceX][pieceY] = tetromino.getTetrominoColor();
                }
            }
        }
        repaint();
    }

    public int getSpikeyness() {
        int spikeyness = 0;
        boolean currentPiece;
        for (int y = 1; y < 21; y++) {
            for (int x = 1; x < 13; x++) {
                currentPiece = map[x][y];
                if (currentPiece != map[x + 1][y]) {
                    spikeyness++;
                }
                if (currentPiece != map[x - 1][y]) {
                    spikeyness++;
                }
                if (currentPiece != map[x][y + 1]) {
                    spikeyness++;
                }
                if (currentPiece != map[x][y - 1]) {
                    spikeyness++;
                }
            }
        }
        return spikeyness;
    }

    // Draw the falling piece
    private void drawPiece(Graphics g) {
        if (current == null) {
            return;
        }
        for (int y = 1; y < 21; y++) {
            for (int x = 1; x < 13; x++) {
                if (map[x][y]) {
                    g.setColor(colors[x][y]);
                    g.fillRect(26 * (x), 26 * (21 - y), 25, 25);
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // Paint the well
        g.fillRect(0, 0, 26 * 14, 26 * 23);
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 13; j++) {
                g.setColor(Color.BLACK);
                g.fillRect(26 * (j), 26 * (i), 25, 25);
            }
        }

        // Display the score
        //g.setColor(Color.WHITE);
        //g.drawString("" + score, 19*12, 25);

        drawPiece(g);
    }
}