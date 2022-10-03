package Sprint_1.Övning_3d;

public class Person {
    private String namn;
    private String personnummer;

    public Person(String namn, String personnummer) {
        this.namn = namn;
        this.personnummer = personnummer;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

}