package Sprint_2.Övning_1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class TriangleTest {

    Triangle t = new Triangle(5, 5);

    @Test
    public void getAreaTest() {
        assert (t.getArea() == 12.5);
        assert (t.getArea() != 12);
    }

    @Test
    public void getCircumferenceTest() {
        assert (t.getCircumference() == 15);
        assert (t.getCircumference() != 14);
    }
}
/*Gör tester för klassen Triangle som representerar en likbent triangel. Skriv sen klassen och ge den en
höjd och en bredd. Låt den implementera Figure. Följ i övrigt punkterna i 1b, skriv tester först,
implementera sedan funktionalitet i Triangle-klassen.*/