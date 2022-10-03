package Sprint_1.Övning_2c;

import java.util.LinkedList;
import java.util.List;

public class Huvudprogram {
    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();
        Fordon fordon = new Fordon(155, 255);
        Bil bil = new Bil(150, 1000.5, 7, 5);
        Båt båt = new Båt(125, 1255.5, 1055.5);
        Tåg tåg = new Tåg(300, 10125.5, 12);
        Cykel cykel = new Cykel(50, 5, 7, 3);

        System.out.println();

        Printable print = fordon;
        h.skrivUtGenomInterface(print);
        print = bil;
        h.skrivUtGenomInterface(print);
        print = båt;
        h.skrivUtGenomInterface(print);
        print = tåg;
        h.skrivUtGenomInterface(print);
        print = cykel;
        h.skrivUtGenomInterface(print);

        System.out.println();

        List<Printable> lista = new LinkedList<>(); // kan man skriva istället för List<Fordon> lista = new LinkedList<>();
        lista.add(bil);
        lista.add(båt);
        lista.add(tåg);
        lista.add(cykel);
        lista.add(fordon);

        for (int i = 0; i < lista.size(); i++) {
            Printable p = lista.get(i);
            p.printMe();
        }

        System.out.println();

        for (Printable p : lista) { // ett enklare sätt
            p.printMe();
        }
    }

    public void skrivUtGenomInterface(Printable print) {
        print.printMe();
    }
}

/*Skriv ett interface Printable och låt metoden printMe vara deklarerad där. Låt sedan dina
fordonsklasser implementera Printable.
Gör en ny utskriftsmetod som skriver ut fordonens data genom att anropa printMe via Printable-interfacet,
istället för att direkt anropa fordonsklassernas printMe-metod.
Lägg till ett anrop till denna
nya metod från ditt huvudprogram.
*/