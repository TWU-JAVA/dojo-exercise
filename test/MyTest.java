import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    @Test
    public void shouldTestArea(){
        int width = 3;
        int length = 2;
        int expectedArea = width * length;
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(rectangle.calculateRectangleArea(width, length),expectedArea);
    }
}
