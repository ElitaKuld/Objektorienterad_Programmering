package Sprint_2.Övning_12;

import java.io.Serializable;

public class Bil implements Serializable {
    private String registreringsnummer;
    private String modell;
    private String märke;
    Bilägare bilägare = new Bilägare();

    public Bil() {
    }

    public Bil(String registreringsnummer, String modell, String märke) {
        this.registreringsnummer = registreringsnummer;
        this.modell = modell;
        this.märke = märke;
    }

    public Bil(String registreringsnummer, String modell, String märke, Bilägare bilägare) {
        this.registreringsnummer = registreringsnummer;
        this.modell = modell;
        this.märke = märke;
        this.bilägare = bilägare;
    }

    public Bil(String registreringsnummer, String modell, String märke, String namn, String adress, int ålder) {
        setRegistreringsnummer(registreringsnummer);
        setModell(modell);
        setMärke(märke);
        bilägare.setNamn(namn);
        bilägare.setAdress(adress);
        bilägare.setÅlder(ålder);
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        if (registreringsnummer != null)
            this.registreringsnummer = registreringsnummer;
        else
            throw new NullPointerException("Felaktigt registreringsnummer");
    }

    public void setModell(String modell) {
        if (modell != null)
            this.modell = modell;
        else
            throw new NullPointerException("Felaktigt registreringsnummer");
    }

    public void setMärke(String märke) {
        if (märke != null)
            this.märke = märke;
        else
            throw new NullPointerException("Felaktigt registreringsnummer");
    }

    public void bytÄgare(String nyÄgare) {
        if (nyÄgare != null)
            bilägare.setNamn(nyÄgare);
        else
            System.out.println("Namnet kan inte vara tomt");
    }

    public void skrivUt() {
        System.out.println("Bilen med registreringsnummer: " + registreringsnummer + ", modell " + modell +
                ", märke " + märke + " tillhör " + bilägare.getNamn() + ".");
    }

    public Bilägare getBilägare() {
        return bilägare;
    }

    public void setBilägare(Bilägare bilägare) {
        this.bilägare = bilägare;
    }

    @Override
    public String toString() {
        return "Registreringsnummer: " + this.registreringsnummer + ", modell: " + this.modell + ", märke: " + this.märke;
    }
}