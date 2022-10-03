package Sprint_1.Övning_3b;

import java.util.ArrayList;

public class Kurs {
    private String namn;
    private ArrayList<Student> studentSomGårKursen;
    private Lärare lärare;

    public Kurs(String namn) {
        this.namn = namn;
        studentSomGårKursen = new ArrayList<>();
    }

    public String getNamn() {
        return namn;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public ArrayList<Student> getAllaStudenter() {
        return studentSomGårKursen;
    }

    public void läggTillStudent(Student student) {
        studentSomGårKursen.add(student);
    }

    public void skrivUtStudenter(ArrayList<Student> student) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i) != null)
                System.out.println(student.get(i).getNamn() + ", personnummer: " + student.get(i).getPersonnummer() +
                        ", går i följande skola: " + student.get(i).getSkola());
        }
    }
}