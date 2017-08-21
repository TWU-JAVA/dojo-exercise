import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    public void shouldAreaEqualsWhenWidth2Andlength3() {
        double expectedArea = 6;
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(expectedArea, rectangle.area());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenWidthOrLengthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 2));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenWidthOrLengthIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 2));
    }

    @Test
    public void shouldAreaEqualsWhenSide2(){
        double expectedArea = 4;
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(expectedArea, square.area());
    }

}
