package Sprint_1.Övning_11d;

import Sprint_1.Övning_3a.Person;

public class Student extends Person {

    private String skola;
    private Kurs[] gårKurs;
    private int räknareKurs;


    public Student(String namn, String personnummer, String skola) {
        super(namn, personnummer);
        this.skola = skola;
        gårKurs = new Kurs[12];
    }

    public String getSkola() {
        return skola;
    }

    public Kurs[] getAllaKurser() {
        return gårKurs;
    }

    public void läggTillKurs(Kurs kurs) {
        gårKurs[räknareKurs] = kurs;
        räknareKurs++;
    }

    public String skrivUtKurser(Kurs[] kurs) {
        String utskrift = "";
        for (int i = 0; i < kurs.length; i++) {
            if (kurs[i] != null)
                utskrift = kurs[i].getNamn();
        }
        return utskrift;
    }
}