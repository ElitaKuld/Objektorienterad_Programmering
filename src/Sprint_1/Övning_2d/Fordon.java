package Sprint_1.Övning_2d;

import Sprint_1.Övning_2c.Printable;

public class Fordon implements Printable, Hjulburen {
    private int hastighet;
    private double vikt;
    private int antalHjul;

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

    public void setAntalHjul(int antalHjul) {
        this.antalHjul = antalHjul;
    }

    public int avläsAntalHjul(){
        return antalHjul;
    }

    public void ändraHastighet(int nyHastighet) {
        this.hastighet = nyHastighet;
    }

    @Override
    public void printMe() {
        System.out.println("Detta fordon har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + " kilogram.");
    }

    @Override
    public int getAntalHjul(){
        return antalHjul;
    }
}