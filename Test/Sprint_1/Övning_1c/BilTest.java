package Sprint_1.Övning_1c;

import Sprint_1.Övning_1a.Bilägare;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {
    public Bil bilA = new Bil("125 BFD", "Tesla", "Universe");
    public Bil bilB = new Bil("255 OOP", "Tesla", "Eclipse");
    public Bilägare ägare = new Bilägare("Elita Kuld", "Sara Moraeas väg 132", 36);
    public Bilägare ägare2 = new Bilägare("David", "Saras väg 32", 29);

    @Test
    void bytÄgare() {
        bilA.bytÄgare(ägare);
        assert(Objects.equals(bilA.getBilägare().getNamn(), "Elita Kuld"));
        assert(bilA.getBilägare().getNamn() != null);
        bilB.bytÄgare(ägare2);
        assert(bilB.getBilägare().getNamn().equals("David"));
        assert(bilB.getBilägare().getNamn() != null);
        bilA.bytÄgare(ägare2);
        assert(bilA.getBilägare().getNamn().equals("David"));
        assert(bilA.getBilägare().getNamn() != null);
        assert(!bilA.getBilägare().getNamn().equals("Elita Kuld"));
    }
}