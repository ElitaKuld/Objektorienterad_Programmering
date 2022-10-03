package Sprint_1.Övning_2a;

public class Cykel extends Fordon {
    private int antalVäxlar;
    private int växelJustNu;

    public Cykel() {
    }

    public Cykel(int antalVäxlar, int växelJustNu) {
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public Cykel(int hastighet, double vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    public void växla(int nyVäxel) {
        växelJustNu = nyVäxel;
    }

    @Override
    public String toString() {
        return "Denna cykel har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, antal växlar: " +
                getAntalVäxlar() + ", nuvarande växel: " + getVäxelJustNu();
    }
}