import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {
    @Test
    public void testAreaWithRadius1ShouldBePI(){
        Circle circle = new Circle(1);
        assertEquals(3.14, circle.area());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenRadius0(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }


}
