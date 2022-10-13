package Sprint_2.Övning_6a;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetalningTest {

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
    public void räknaUtAntalValörerTest(){

        b.räknaUtAntalValörer(451,valörer, resultat);
        assert(resultat.size() == 3);
        assert(resultat.get(0).getValörVärde() == 200);
        assert(resultat.get(1).getAntal() == 1);
        assert(resultat.get(2).getValörVärde() == 1);
    }
}