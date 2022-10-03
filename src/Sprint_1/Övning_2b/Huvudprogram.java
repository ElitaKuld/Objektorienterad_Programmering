package Sprint_1.Övning_2b;

import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {
    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram(); // skapa en instans av klassen HuvudprogramSkola

        Bil bil = new Bil(150, 1000.5, 7, 5);
        Båt båt = new Båt(125, 1255.5, 1055.5);
        Tåg tåg = new Tåg(300, 10125.5, 12);
        Cykel cykel = new Cykel(50, 5, 7, 3);
        FordonAbstrakt fordon = new Cykel(45, 3.5, 7, 5);

        bil.printMe(); // mitt enklaste sätt
        båt.printMe();
        tåg.printMe();
        cykel.printMe();
        fordon.printMe();
        System.out.println();

        h.skrivUtFordon(bil); // anropet av metoden som skriver ut data om mina fordon
        h.skrivUtFordon(båt);
        h.skrivUtFordon(tåg);
        h.skrivUtFordon(cykel);
        h.skrivUtFordon(fordon);
        System.out.println();

        List<FordonAbstrakt> lista = new ArrayList<>(); // ett sätt att skapa en lista och skriva ut den sedan
        lista.add(bil);
        lista.add(båt);
        lista.add(tåg);
        lista.add(cykel);
        lista.add(fordon);

        // List<Fordon> lista = Arrays.asList(tåg, bil, cykel, båt, f); // ett annat sätt att lägga dessa objekt i en lista

        for (int i = 0; i < lista.size(); i++) {
            FordonAbstrakt a = lista.get(i);
            a.printMe();
        }
        System.out.println();

        for (FordonAbstrakt a : lista) { // ett enklare sätt att löpa genom en lista och skriva ut dess objekt
            a.printMe();
        }
    }

    public void skrivUtFordon(FordonAbstrakt fordon) { // metod som skriver ut data om mina fordon
        fordon.printMe();
    }
}

/*Låt Fordon bli abstrakt
Lägg till den abstrakta metoden printMe() i Fordon och implementera den i de olika subklasserna.
printMe() ska skriva ut vikt, hastighet och övriga data för varje subklass.
Lägg sedan till ett huvudprogram som skapar upp ett fordon av varje sort.
Lägg till en metod som skriver ut data om de fordon du skapat.
Anropa utskriftsmetoden från ditt huvudprogram.*/