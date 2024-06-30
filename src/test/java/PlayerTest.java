import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player playerX = new Player('X');
        assertEquals('X', playerX.getMarker());

        Player playerO = new Player('O');
        assertEquals('O', playerO.getMarker());
    }

    @Test
    public void testGetMarker() {
        Player playerX = new Player('X');
        assertEquals('X', playerX.getMarker());

        Player playerO = new Player('O');
        assertEquals('O', playerO.getMarker());
    }
}