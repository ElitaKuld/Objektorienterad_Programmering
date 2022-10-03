package Sprint_1.Övning_3a;

public class Kurs {
    private String namn;
    private Student[] studentSomGårKursen;
    private Lärare lärare;
    private int räknareStudenter;

    public Kurs(String namn) {
        this.namn = namn;
        studentSomGårKursen = new Student[45];
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

    public Student[] getAllaStudenter() {
        return studentSomGårKursen;
    }

    public void läggTillStudent(Student student) {
        studentSomGårKursen[räknareStudenter] = student;
        räknareStudenter++;
    }

    public void skrivUtStudenter(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null)
                System.out.println(student[i].getNamn() + ", personnummer: " + student[i].getPersonnummer() +
                        ", går i följande skola: " + student[i].getSkola());
        }
    }
}