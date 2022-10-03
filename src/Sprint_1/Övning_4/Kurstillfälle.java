package Sprint_1.Övning_4;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Kurstillfälle {
    private String datum;
    private Kurs kurs;
    private Lärare lärarePåKursen;
    private LinkedList<Student> student;

    public Kurstillfälle() {
    }

    public void setDatum() {
        this.datum = Calendar.getInstance().getTime().toString();
    }

    public String getDatum() {
        return this.datum;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public void setLärarePåKursen(Lärare lärarePåKursen) {
        this.lärarePåKursen = lärarePåKursen;
    }

    public void setStudent(LinkedList<Student> student) {
        this.student = student;
    }

    public LinkedList<Student> getStudent() {
        return student;
    }

    public LinkedList<Student> läggTillStudent(Kurs kurs, List<Deltagande> deltagande) {
        LinkedList<Student> listaÖverStudenter = new LinkedList<>();
        for (int i = 0; i < deltagande.size(); i++) {
            if (kurs.getNamn().equals(deltagande.get(i).getKurs().getNamn()))
                listaÖverStudenter.add(deltagande.get(i).getStudent());
        }
        return listaÖverStudenter;
    }
}