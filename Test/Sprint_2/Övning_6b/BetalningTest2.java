package Sprint_2.Övning_6b;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetalningTest2 {

    Betalning b = new Betalning(49, 500);
    List<Integer> valörer = Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);
    List<Valör> resultat = new ArrayList<>();


    @Test
    public void geVäxelTest() {
        assert (b.geVäxel() == 451);
        assert (b.geVäxel() != 450);
        assert (b.geVäxel() != 0);
    }

    @Test
    public void räknaUtAntalValörerTest() {
        b.räknaUtAntalValörer(451, valörer, resultat);
        assert (resultat.size() == 3);
        assert (resultat.get(0).getValörVärde() == 200);
        assert (resultat.get(1).getAntal() == 1);
        assert (resultat.get(2).getValörVärde() == 1);
    }

    @Test
    public void betaltFörLiteTest() {
        b.setPris(49);
        b.setBeloppBetalt(48);
        assert(b.betaltFörLite());
    }

    @Test
    public void betaltMedJämnaPengarTest(){
        b.setPris(49);
        b.setBeloppBetalt(49);
        assert(b.betaltMedJämnaPengar());
    }

    @Test
    void skrivUtVäxelValörer() {
        List<Valör> resultat = new ArrayList<>();
        resultat.add(new Valör(2,200));
        resultat.add(new Valör(1,50));
        resultat.add(new Valör(1,1));
        assert(b.skrivUtVäxelValörer(resultat).equals("Du ska få följande växel:\n" + "Antal 200-lappar: 2\n" +
                "Antal 50-lappar: 1\n" + "Antal 1-kronor: 1\n"));
    }
}