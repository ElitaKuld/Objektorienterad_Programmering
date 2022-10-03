package Sprint_1.Övning_3a;

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

    public void skrivUtKurser(Kurs[] kurs) {
        for (int i = 0; i < kurs.length; i++) {
            if (kurs[i] != null)
                System.out.println(kurs[i].getNamn());
        }
    }
}