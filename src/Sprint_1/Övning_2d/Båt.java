package Sprint_1.Övning_2d;

import Sprint_1.Övning_2c.Printable;

public class Båt extends Fordon implements Printable, Hjulburen {
    private double dödvikt;

    public Båt() {
    }

    public Båt(double dödvikt) {
        this.dödvikt = dödvikt;
    }

    public Båt(int hastighet, double vikt, double dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public double getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(double dödvikt) {
        this.dödvikt = dödvikt;
    }

    public void svänga() {
    }

    @Override
    public void printMe() {
        System.out.println("Denna båt har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, dödvikt på " +
                getDödvikt() + " kilogram.");
    }

    @Override
    public int getAntalHjul(){
        return avläsAntalHjul();
    }
}