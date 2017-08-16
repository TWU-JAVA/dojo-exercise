import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testAreaWithRadius1ShouldBePI(){
        Circle circle = new Circle(1);
        Assert.assertEquals(3.14, circle.calculateArea(),0);
    }

    @Test
    public void testAreaWithRadius0ShouldThrowException(){
        Circle circle = new Circle(0);
      //  Assert.
    }
}
