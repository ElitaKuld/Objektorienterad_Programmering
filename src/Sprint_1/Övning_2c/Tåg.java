package Sprint_1.Övning_2c;

public class Tåg extends Fordon implements Printable {
    private int antalVagnar;

    public Tåg() {
    }

    public Tåg(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    public Tåg(int hastighet, double vikt, int antalVagnar) {
        super(hastighet, vikt);
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

    @Override
    public void printMe() {
        System.out.println("Detta tåg har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, " +
                "dessutom har det " + getAntalVagnar() + " vagnar.");
    }
}