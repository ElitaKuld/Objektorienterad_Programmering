package Sprint_1.Övning_2c;

public class Fordon implements Printable {
    private int hastighet;
    private double vikt;

    public Fordon() {
    }

    public Fordon(int hastighet, double vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    public void ändraHastighet(int nyHastighet) {
        this.hastighet = nyHastighet;
    }

    @Override
    public void printMe() {
        System.out.println("Detta fordon har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + " kilogram.");
    }
}