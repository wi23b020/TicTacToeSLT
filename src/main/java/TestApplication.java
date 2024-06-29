
import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args) {
            TicTacToe game = new TicTacToe();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Willkommen bei Tic-Tac-Toe!");
            game.start(scanner);

    }
}