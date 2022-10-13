package Sprint_1.Övning_11d;

import Sprint_1.Övning_3a.Person;

public class Lärare extends Person {
    private String skola;
    private Kurs[] gerKurs;
    private int räknareKurs;

    public Lärare(String namn, String personnummer, String skola) {
        super(namn, personnummer);
        this.skola = skola;
        gerKurs = new Kurs[12];
    }

    public void läggTillKurs(Kurs kurs) {
        gerKurs[räknareKurs] = kurs;
        räknareKurs++;
    }
}