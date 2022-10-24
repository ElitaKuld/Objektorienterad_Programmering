package Sprint_2.Övning_6d;

import org.junit.jupiter.api.Test;

public class InputDataReaderTest {

    int mockPrice = 55;
    int mockAmount = 500;

    @Test
    void readPriceTest() {
        assert (InputDataReader.readPrice(true) == 55);
        assert (InputDataReader.readPrice(true) != 0);
        assert (InputDataReader.readPrice(true) != 54);
    }

    @Test
    void readAmountTest() {
        assert (InputDataReader.readAmount(true) == 500);
        assert (InputDataReader.readAmount(true) != 0);
        assert (InputDataReader.readAmount(true) != 501);
    }
}
