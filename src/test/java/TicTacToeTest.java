
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testSwitchCurrentPlayer() {
        Player player1 = new Player('X');
        Player player2 = new Player('O');

        assertEquals(player1.getMarker(), game.getCurrentPlayer().getMarker());
        game.switchCurrentPlayer();
        assertEquals(player2.getMarker(), game.getCurrentPlayer().getMarker());
        game.switchCurrentPlayer();
        assertEquals(player1.getMarker(), game.getCurrentPlayer().getMarker());
    }

    @Test
    public void testMakeMove() {
        String input = "0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        game.makeMove(scanner);

        assertEquals('X', game.getBoard().getCells()[0][0]);
    }

    @Test
    public void testHasWinnerRow() {
        Board board = game.getBoard();
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');

        assertTrue(game.hasWinner());
    }

    @Test
    public void testHasWinnerColumn() {
        Board board = game.getBoard();
        board.place(0, 0, 'X');
        board.place(1, 0, 'X');
        board.place(2, 0, 'X');

        assertTrue(game.hasWinner());
    }

    @Test
    public void testHasWinnerDiagonal() {
        Board board = game.getBoard();
        board.place(0, 0, 'X');
        board.place(1, 1, 'X');
        board.place(2, 2, 'X');

        assertTrue(game.hasWinner());
    }

    @Test
    public void testGameDraw() {
        Board board = game.getBoard();
        board.place(0, 0, 'X');
        board.place(0, 1, 'O');
        board.place(0, 2, 'X');
        board.place(1, 0, 'X');
        board.place(1, 1, 'X');
        board.place(1, 2, 'O');
        board.place(2, 0, 'O');
        board.place(2, 1, 'X');
        board.place(2, 2, 'O');

        assertFalse(game.hasWinner());
        assertTrue(board.isFull());
    }
}

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}

