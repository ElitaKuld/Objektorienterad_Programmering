package Sprint_1.Övning_2b;

public class Tåg extends FordonAbstrakt {
    private int antalVagnar;

    public Tåg() {
    }

    public Tåg(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    public Tåg(int hastighet, double vikt, int antalVagnar) {
        setHastighet(hastighet);
        setVikt(vikt);
        this.antalVagnar = antalVagnar;
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn() {
        antalVagnar = antalVagnar + 1;
    }

    public void printMe() {
        System.out.println("Detta tåg har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, " +
                "dessutom har det " + getAntalVagnar() + " vagnar.");
    }
}