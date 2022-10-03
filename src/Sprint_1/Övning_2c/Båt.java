package Sprint_1.Övning_2c;

public class Båt extends Fordon implements Printable{
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
}