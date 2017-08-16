import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testAreaWithSide1ShouldBe1(){
        Square square = new Square(1);
        Assert.assertEquals(1,square.calculateArea());
    }

    @Test
    public void testAreaWithSide0ShouldThrowException(){
        Square square = new Square(0);
        Assert.assertEquals(IndexOutOfBoundsException.class,square.calculateArea());
    }
}
