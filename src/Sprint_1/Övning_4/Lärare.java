package Sprint_1.Övning_4;

import java.util.ArrayList;

public class Lärare extends Person {
    private String skola;
    private ArrayList<Kurs> gerKurs;

    public Lärare(String namn, String personnummer, String skola) {
        super(namn, personnummer);
        this.skola = skola;
        gerKurs = new ArrayList<>();
    }

    public void läggTillKurs(Kurs kurs){
        gerKurs.add(kurs);
    }
}