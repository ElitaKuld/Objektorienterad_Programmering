package Sprint_2.Övning_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {

    Circle c = new Circle(5);

    @Test
    public void getAreaTest() { // rätt svar 78.5398163397
        assert (c.getArea() == Math.PI * 5 * 5);
        assert (c.getArea() != 0);
        assertTrue(c.getArea() - 78.539 > 0);
        assertTrue(c.getArea() - 79 < 0);
    }
    /*//rätt svar: 28.2743339
        assertTrue(c1.getArea() - 28.274 > 0);
        assertTrue(c1.getArea() - 29 < 0);*/

    @Test
    public void getCircumferenceTest() { // rätt svar 15.7079632679
        assert (c.getCircumference() == Math.PI * 5);
        assert (c.getCircumference() != 0);
        assertTrue(c.getCircumference() - 15.707 > 0);
        assertTrue(c.getCircumference() - 16 < 0);
    }
}