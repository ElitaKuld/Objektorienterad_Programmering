package Sprint_4.Övning_6;

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
/*Gör om uppgift 5, men istället för att skicka strängar, låt servern skicka ett serialiserat objekt av typen
Kompis till klienten. Låt klienten skriva ut Kompisens:s data
Tips: Använd klasserna ObjectOutputStream och ObjectInputStream för att skicka och ta emot de
serialiserade objekten.*/