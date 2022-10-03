package Sprint_1.Övning_4;

public class Student extends Person {

    private String skola;

    public Student(String namn, String personnummer, String skola) {
        super(namn, personnummer);
        this.skola = skola;
    }

    public String getSkola() {
        return skola;
    }
}