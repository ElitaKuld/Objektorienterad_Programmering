package Sprint_1.Övning_1c;

import Sprint_1.Övning_1a.Bilägare;

public class Bil {
    private String registreringsnummer;
    private String modell;
    private String märke;
    Bilägare bilägare = new Bilägare();

    public Bil(String s, String tesla, String eclipse) {
    }

    public Bil(String registreringsnummer, String modell, String märke, String namn, String adress, int ålder) {
        setRegistreringsnummer(registreringsnummer);
        setModell(modell);
        setMärke(märke);
        bilägare.setNamn(namn);
        bilägare.setAdress(adress);
        bilägare.setÅlder(ålder);
    }

    public Bil(Bilägare ägare) {
        if (ägare != null)
            bilägare = ägare;
        else
            throw new NullPointerException();
    }
    public Bilägare getBilägare() {
        return bilägare;
    }

    public void setBilägare(Bilägare bilägare) {
        if (bilägare != null)
            this.bilägare = bilägare;
        else
            throw new NullPointerException();
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        if (registreringsnummer != null)
            this.registreringsnummer = registreringsnummer;
        else
            throw new NullPointerException("Felaktigt registreringsnummer");
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        if (modell != null)
            this.modell = modell;
        else
            throw new NullPointerException("Felaktigt registreringsnummer");
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        if (märke != null)
            this.märke = märke;
        else
            throw new NullPointerException("Felaktigt registreringsnummer");
    }

    public void bytÄgare(Bilägare nyÄgare) {
        bilägare.setNamn(nyÄgare.getNamn());
    }

    public void skrivUt() {
        System.out.println("Bilen med registreringsnummer: " + registreringsnummer + ", modell " + modell +
                ", märke " + märke + " tillhör " + bilägare.getNamn() + ".");
    }
}