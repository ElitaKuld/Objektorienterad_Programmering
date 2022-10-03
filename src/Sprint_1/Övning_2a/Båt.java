package Sprint_1.Övning_2a;

public class Båt extends Fordon {
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
    public String toString() {
        return "Denna båt har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, dödvikt på " +
                getDödvikt() + " kilogram.";
    }
}