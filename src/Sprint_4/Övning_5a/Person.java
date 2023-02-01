package Sprint_4.Övning_5a;

public class Person {
    private String namn;
    private String adress;
    private String mobilnummer;
    private String födelsedag;

    public Person(String namn, String adress, String mobilnummer, String födelsedag) {
        this.namn = namn;
        this.adress = adress;
        this.mobilnummer = mobilnummer;
        this.födelsedag = födelsedag;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMobilnummer() {
        return mobilnummer;
    }

    public void setMobilnummer(String mobilnummer) {
        this.mobilnummer = mobilnummer;
    }

    public String getFödelsedag() {
        return födelsedag;
    }

    public void setFödelsedag(String födelsedag) {
        this.födelsedag = födelsedag;
    }
}
/*Skriv ett telefonboksprogram, med client-server-arkitektur.
En klient-app skickar över ett namn till servern. Servern kollar i sin databas om namnet finns. Om ja,
då skickar servern tillbaka en sträng med personens namn, adress, mobilnummer och födelsedag. Om
personen inte finns i databasen skickar servern över ”Denna person fanns inte i databasen”.
På server-sidan: Gör en Kompis.java-klass som innehåller namn, mobilnummer, födelsedag och email.
Gör även databas-klass (eller DAO-klass, DAO står för Data Access Object).
Låt databas-klassen ha en metod getKompis(String name) som returnerar en sträng med en kompis
alla data, appendade i en String.
Gör även en server-klass som tar emot anrop från klienten och skickar tillbaka svar.
På klient-sidan: Gör en klient-app som anropar servern och skickar över ett namn (som en String). När
serverns svar kommer ska klienten skriva ut detta i consolen.*/