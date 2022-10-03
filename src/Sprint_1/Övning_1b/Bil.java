package Sprint_1.Övning_1b;

import Sprint_1.Övning_1a.Bilägare;

public class Bil {
    private String registreringsnummer;
    private String modell;
    private String märke;
    protected Bilägare bilägare = new Bilägare();

    public Bil() {
    }

    public Bil(String registreringsnummer, String modell, String märke, String namn, String adress, int ålder) {
        setRegistreringsnummer(registreringsnummer);
        setModell(modell);
        setMärke(märke);
        bilägare.setNamn(namn);
        bilägare.setAdress(adress);
        bilägare.setÅlder(ålder);
    }

    public Bil(String registreringsnummer, String modell, String märke, Bilägare bilägare) {
        setRegistreringsnummer(registreringsnummer);
        setModell(modell);
        setMärke(märke);
        this.bilägare.setNamn(bilägare.getNamn());
        this.bilägare.setAdress(bilägare.getAdress());
        this.bilägare.setÅlder(bilägare.getÅlder());
    }

    public Bil (String registreringsnummer, String modell, String märke) {
        setRegistreringsnummer(registreringsnummer);
        setModell(modell);
        setMärke(märke);
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
}