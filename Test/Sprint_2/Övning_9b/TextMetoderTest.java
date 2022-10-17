package Sprint_2.Övning_9b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TextMetoderTest {

    String text = "Kalle Nilsson, Xvägen 1, 12345 Ystad";
    String text2 = "25, 80, 175";

    @Test
    void delaStringINamn() {
        assert (TextMetoder.delaStringINamn(text).equals("Kalle Nilsson"));
        assertFalse(TextMetoder.delaStringINamn(text).equals("Mimmi Mattsson"));
        assertNotEquals("", TextMetoder.delaStringINamn(text)); // ett enklare sätt
    }

    @Test
    void delaStringIAdress() {
        assert (TextMetoder.delaStringIAdress(text).equals("Xvägen 1"));
        assertFalse(TextMetoder.delaStringIAdress(text).equals("Xvägen 2"));
        assertNotEquals("", TextMetoder.delaStringIAdress(text)); // ett enklare sätt
    }

    @Test
    void delaStringIBostadsort() {
        assert (TextMetoder.delaStringIBostadsort(text).equals("12345 Ystad"));
        assertNotEquals("", TextMetoder.delaStringIBostadsort(text)); // ett enklare sätt
    }

    @Test
    void delaStringIÅlder() {
        assert (TextMetoder.delaStringIÅlder(text2)) == 25;
        assert (TextMetoder.delaStringIÅlder(text2)) != 26;
        assert (TextMetoder.delaStringIÅlder(text2)) != 0;
    }

    @Test
    void delaStringIVikt() {
        assert (TextMetoder.delaStringIVikt(text2)) == 80;
        assert (TextMetoder.delaStringIVikt(text2)) != 81;
        assert (TextMetoder.delaStringIVikt(text2)) != 0;
    }

    @Test
    void delaStringILängd() {
        assert (TextMetoder.delaStringILängd(text2)) == 175;
        assert (TextMetoder.delaStringILängd(text2)) != 176;
        assert (TextMetoder.delaStringILängd(text2)) != 0;
    }
}