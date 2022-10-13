package Sprint_2.Övning_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BilTest {

    Bil bil = new Bil(4461, 2974, 1235.4);

    @Test
    public void getAmountMileTest() {
        assert (bil.getAmountMile() == 1487);
        assert (bil.getAmountMile() != 1486);
    }

    @Test
    public void getAmountGasolineTest() { // rätt svar: 0,8308002689979825
        assert (bil.getAmountGasoline(1487) == 1235.4 / 1487);
        assert (bil.getAmountGasoline(1487) != 0.84);
        assertTrue(bil.getAmountGasoline(1487) - 0.830 > 0);
        assertTrue(bil.getAmountGasoline(1487) - 0.84 < 0);
    }

    @Test
    public void skrivUtResultatMixTest() {
        assertEquals("Antal körda mil: 1487.0", bil.getAmountMilePrintout(1487.0)); // ett sätt
        assertTrue(bil.getAmountGasolinePrintout(1235.4).equals("Antal liter bensin: 1235.4")); // ett annat sätt (Sigruns)
        assertTrue(bil.getAmountGasolinePerMilePrintout(0.83).equals("Förbrukning per mil: 0.83"));
    }
}