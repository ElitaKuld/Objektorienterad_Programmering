package Sprint_1.Övning_2d;

import Sprint_1.Övning_2c.Printable;

public class Cykel extends Fordon implements Printable, Hjulburen {
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
    public void printMe() {
        System.out.println("Denna cykel har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, antal växlar: " +
                getAntalVäxlar() + ", nuvarande växel: " + getVäxelJustNu());
    }

    @Override
    public int getAntalHjul(){
        return avläsAntalHjul();
    }
}