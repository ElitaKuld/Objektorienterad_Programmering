package Sprint_2.Övning_1;

import org.junit.jupiter.api.Test;

public class SquareTest {

    Square s = new Square(5, 5);

    @Test
    public void getAreaTest() {
        assert (s.getArea() == 25);
        assert (s.getArea() != 26);
        s.setWidth(3);
        s.setLength(3);
        assert (s.getArea() == 9);
        assert (s.getArea() != 8);
    }

    @Test
    public void getCircumferenceTest() {
        assert (s.getCircumference() == 20);
        assert (s.getCircumference() != 25);
        s.setWidth(3);
        s.setLength(3);
        assert (s.getCircumference() == 12);
        assert (s.getCircumference() != 10);
    }
}
/* Skapa testklassen SquareTest i din testkatalog
• Skapa klassen Square som implementerar Figure
• Låt Square ha length och width (integers)
• Skriv tester getAreaTest() och getCircumferenceTest()
• Skriv sedan funktionerna som räknar ut Area och omkrets
• Verifiera att testerna går gröna*/