package Sprint_4.Övning_8;

public class Kompis extends Person {

    private String email;

    public Kompis(String namn, String adress, String mobilnummer, String födelsedag, String email) {
        super(namn, adress, mobilnummer, födelsedag);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getNamn() + " " + getAdress() + " " + getMobilnummer() + " " + getFödelsedag() + " " + getEmail();
    }
}