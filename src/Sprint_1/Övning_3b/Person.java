package Sprint_1.Övning_3b;

public class Person {
    private String namn;
    private String personnummer;

    public Person(String namn, String personnummer) {
        this.namn = namn;
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

}