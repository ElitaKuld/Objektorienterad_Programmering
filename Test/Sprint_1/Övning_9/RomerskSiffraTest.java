package Sprint_1.Övning_9;

import org.junit.jupiter.api.Test;

class RomerskSiffraTest {

    @Test
    void getSiffervärde() {
        assert(RomerskSiffra.I.getSiffervärde() == 1);
        assert(RomerskSiffra.V.getSiffervärde() == 5);
        assert(RomerskSiffra.X.getSiffervärde() == 10);
        assert(RomerskSiffra.L.getSiffervärde() == 50);
        assert(RomerskSiffra.C.getSiffervärde() == 100);
        assert(RomerskSiffra.D.getSiffervärde() == 500);
        assert(RomerskSiffra.M.getSiffervärde() == 1000);
    }

    @Test
    void getUppräkningsOrder() {
        assert(RomerskSiffra.I.getUppräkningsOrder() == 1);
        assert(RomerskSiffra.V.getUppräkningsOrder() == 2);
        assert(RomerskSiffra.X.getUppräkningsOrder() == 3);
        assert(RomerskSiffra.L.getUppräkningsOrder() == 4);
        assert(RomerskSiffra.C.getUppräkningsOrder() == 5);
        assert(RomerskSiffra.D.getUppräkningsOrder() == 6);
        assert(RomerskSiffra.M.getUppräkningsOrder() == 7);
    }
}