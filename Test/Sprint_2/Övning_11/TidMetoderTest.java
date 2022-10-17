package Sprint_2.Övning_11;

import org.junit.jupiter.api.Test;

import java.time.chrono.MinguoChronology;

public class TidMetoderTest {

    String början = "20:25";
    String slut = "21:15";

    @Test
    void räknaUtDurationTest() {
        int resultat = TidMetoder.räknaUtDuration(början, slut);
        assert (resultat != 45);
        assert (resultat != 0);
        assert (resultat == 50);
    }

    @Test
    void räknaUtTillgängligTidTest() {
        int resultat = TidMetoder.räknaUtTillgängligTid(360, 120);
        assert (resultat != 220);
        assert (resultat != 0);
        assert (resultat == 240);
    }

    @Test
    void checkIfItFitsTest(){
        assert(TidMetoder.checkIfItFits(240, 50));
    }

    @Test
    void geSammanfattningTest(){
        assert(TidMetoder.geSammanfattning(true).equals("Ja, detta tv-program får plats på ditt videoband."));
    }
}