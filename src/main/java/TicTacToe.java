import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Board getBoard() {
        return board;
    }


    public void start(Scanner scanner) {
        while (!hasWinner() && !board.isFull()) {
            board.print();
            makeMove(scanner);
            if (!hasWinner()) {
                switchCurrentPlayer();
            }
        }
        board.print();
        if (hasWinner()) {

            System.out.println("Spieler " + currentPlayer.getMarker() + " gewinnt!");
        } else {
            System.out.println("Das Spiel endet unentschieden.");
        }
    }

    protected void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }


    protected boolean hasWinner() {

            System.out.println("The winner is: " + currentPlayer.getMarker());
        } else {
            System.out.println("Draw.");
        }
    }

    private void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean hasWinner() {

        return checkRows() || checkColumns() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {

            if (board.getCells()[i][0] == currentPlayer.getMarker() &&
                    board.getCells()[i][1] == currentPlayer.getMarker() &&
                    board.getCells()[i][2] == currentPlayer.getMarker()) {

            if (board.cells[i][0] == currentPlayer.getMarker() &&
                    board.cells[i][1] == currentPlayer.getMarker() &&
                    board.cells[i][2] == currentPlayer.getMarker()) {

                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {

            if (board.getCells()[0][i] == currentPlayer.getMarker() &&
                    board.getCells()[1][i] == currentPlayer.getMarker() &&
                    board.getCells()[2][i] == currentPlayer.getMarker()) {

            if (board.cells[0][i] == currentPlayer.getMarker() &&
                    board.cells[1][i] == currentPlayer.getMarker() &&
                    board.cells[2][i] == currentPlayer.getMarker()) {

                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {

        return (board.getCells()[0][0] == currentPlayer.getMarker() &&
                board.getCells()[1][1] == currentPlayer.getMarker() &&
                board.getCells()[2][2] == currentPlayer.getMarker()) ||
                (board.getCells()[0][2] == currentPlayer.getMarker() &&
                        board.getCells()[1][1] == currentPlayer.getMarker() &&
                        board.getCells()[2][0] == currentPlayer.getMarker());
    }

    protected void makeMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.println("Spieler " + currentPlayer.getMarker() + ", bitte gib deine Zeile (0-2) ein:");
            row = scanner.nextInt();
            System.out.println("Spieler " + currentPlayer.getMarker() + ", bitte gib deine Spalte (0-2) ein:");

        return (board.cells[0][0] == currentPlayer.getMarker() &&
                board.cells[1][1] == currentPlayer.getMarker() &&
                board.cells[2][2] == currentPlayer.getMarker()) ||
                (board.cells[0][2] == currentPlayer.getMarker() &&
                        board.cells[1][1] == currentPlayer.getMarker() &&
                        board.cells[2][0] == currentPlayer.getMarker());
    }

    private void makeMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer.getMarker() + ", Row (0-2):");
            row = scanner.nextInt();
            System.out.println("Player " + currentPlayer.getMarker() + ", Column (0-2):");

            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board.isCellEmpty(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
                break;
            } else {

                System.out.println("Ungültiger Zug. Bitte versuche es erneut.");
            }
        }
    }
}

                System.out.println("Illegal move.");
            }
        }
    }
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
        game.start(scanner);
    }
}



