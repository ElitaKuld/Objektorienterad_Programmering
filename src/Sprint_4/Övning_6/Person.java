package Sprint_4.Övning_6;

import java.io.Serializable;

public class Person implements Serializable { // för att kunna serialisera!!!
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