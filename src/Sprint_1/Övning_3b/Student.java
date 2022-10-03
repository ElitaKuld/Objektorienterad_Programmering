package Sprint_1.Övning_3b;

import java.util.ArrayList;

public class Student extends Person {

    private String skola;
    private ArrayList<Kurs> gårKurs;


    public Student(String namn, String personnummer, String skola) {
        super(namn, personnummer);
        this.skola = skola;
        gårKurs = new ArrayList<>();
    }

    public String getSkola() {
        return skola;
    }

    public ArrayList<Kurs> getAllaKurser() {
        return gårKurs;
    }

    public void läggTillKurs(Kurs kurs){
        gårKurs.add(kurs);
    }

    public void skrivUtKurser(ArrayList<Kurs> kurs) {
        for (int i = 0; i < kurs.size(); i++) {
            if (kurs.get(i) != null)
                System.out.println(kurs.get(i).getNamn());
        }
    }
}