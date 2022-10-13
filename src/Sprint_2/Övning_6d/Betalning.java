package Sprint_2.Övning_6d;

import java.util.Arrays;
import java.util.List;

public class Betalning {

    private int pris;
    private int beloppBetalt;
    private final List<Integer> valörer = Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public Betalning() {
    }

    public Betalning(int pris, int belopp) {
        this.pris = pris;
        this.beloppBetalt = belopp;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getBeloppBetalt() {
        return beloppBetalt;
    }

    public void setBeloppBetalt(int belopp) {
        this.beloppBetalt = belopp;
    }

    public List<Integer> getValörer() {
        return valörer;
    }

    public int geVäxel() {
        return beloppBetalt - pris;
    }

    public void räknaUtAntalValörer(int växel, List<Integer> valörer, List<Valör> resultat) {
        int belopp = växel;
        int antal = 0;
        for (int i = 0; i < valörer.size() && belopp >= 0; i++)
            if (valörer.get(i) <= belopp) {
                antal = belopp / valörer.get(i);
                resultat.add(new Valör(antal, valörer.get(i)));
                belopp = belopp % valörer.get(i);
            }
    }

    public boolean betaltFörLite() {
        boolean förLite = false;
        if (this.pris > this.beloppBetalt)
            förLite = true;
        return förLite;
    }

    public boolean betaltMedJämnaPengar() {
        boolean jämnaPengar = false;
        if (this.pris == this.beloppBetalt)
            jämnaPengar = true;
        return jämnaPengar;
    }

    public String skrivUtVäxelValörer(List<Valör> resultat) {
        String text = "Du ska få följande växel:\n";
        for (int i = 0; i < resultat.size(); i++) {
            if (resultat.get(i).getValörVärde() > 10)
                text = text + "Antal " + resultat.get(i).getValörVärde() + "-lappar: " + resultat.get(i).getAntal() + "\n";
            else if (resultat.get(i).getValörVärde() <= 10)
                text = text + "Antal " + resultat.get(i).getValörVärde() + "-kronor: " + resultat.get(i).getAntal() + "\n";
        }
        return text;
    }

    public StringBuilder skrivUtVäxelValörerStringBuilder(List<Valör> resultat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Du ska få följande växel:\n");
        for (int i = 0; i < resultat.size(); i++) {
            if (resultat.get(i).getValörVärde() > 10)
                sb.append("Antal ").append(resultat.get(i).getValörVärde()).append("-lappar: ").append(resultat.get(i).getAntal()).append("\n");
            else if (resultat.get(i).getValörVärde() <= 10)
                sb.append("Antal ").append(resultat.get(i).getValörVärde()).append("-kronor: ").append(resultat.get(i).getAntal()).append("\n");
        }
        return sb;
    }
}