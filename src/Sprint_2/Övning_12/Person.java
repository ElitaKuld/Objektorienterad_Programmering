package Sprint_2.Övning_12;

import java.io.Serializable;

public class Person implements Serializable {
    private String namn;
    private String adress;
    private int ålder;

    public Person() {
    }

    public Person(String namn, String adress, int ålder) {
        setNamn(namn);
        setAdress(adress);
        setÅlder(ålder);
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        if (namn != null)
            this.namn = namn;
        else
            throw new NullPointerException("Felaktigt namn!");
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if (adress != null)
            this.adress = adress;
        else
            throw new NullPointerException("Felaktig adress!");
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        if (ålder > 0 && ålder < 120)
            this.ålder = ålder;
        else throw new IllegalArgumentException("Felaktig ålder!");
    }

    @Override
    public String toString() {
        return namn + " " + adress + " " + ålder;
    }
}