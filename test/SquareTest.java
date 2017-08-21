import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    public void testAreaWithSide1ShouldBe1() {
        Square square = new Square(1);
        assertEquals(1, square.area());
    }

    @Test
    public void testAreaWithSide0ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0));
    }

}
