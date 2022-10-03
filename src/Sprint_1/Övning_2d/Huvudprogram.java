package Sprint_1.Övning_2d;

import java.util.Arrays;
import java.util.List;

public class Huvudprogram {
    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();
        Fordon fordon = new Fordon(155, 255);
        fordon.setAntalHjul(1);
        Bil bil = new Bil(150, 1000.5, 7, 5);
        bil.setAntalHjul(4);
        Båt båt = new Båt(125, 1255.5, 1055.5);
        båt.setAntalHjul(0);
        Tåg tåg = new Tåg(300, 10125.5, 12);
        tåg.setAntalHjul(48);
        Cykel cykel = new Cykel(50, 5, 7, 3);
        cykel.setAntalHjul(2);

        System.out.println();

        Hjulburen buren = fordon;
        h.skrivUtAntalHjul(buren);
        buren = bil;
        h.skrivUtAntalHjul(buren);
        buren = båt;
        h.skrivUtAntalHjul(buren);
        buren = tåg;
        h.skrivUtAntalHjul(buren);
        buren = cykel;
        h.skrivUtAntalHjul(buren);

        System.out.println();

        List<Hjulburen> lista = Arrays.asList(fordon, bil, båt, tåg, cykel);

        for (int i = 0; i < lista.size(); i++) {
            Hjulburen hb = lista.get(i);
            h.skrivUtAntalHjul(hb);
        }

        System.out.println();

        for (Hjulburen hb : lista) { // ett annat sätt
            h.skrivUtAntalHjul(hb);
        }

        System.out.println();
    }


    public void skrivUtAntalHjul(Hjulburen hjul) {
        System.out.println(hjul.getAntalHjul());
    }
}

/*Lägg till ett ytterligare interface “Hjulburen” som har metoden getAntalHjul()
Låt relevanta klasser implementera interfacet (lägg till instansvariabler vid behov)
Skapa upp några objekt av typen “Hjulburen” med olika implementerande klasser och skriv ut antalet
hjul för varje fordon.*/