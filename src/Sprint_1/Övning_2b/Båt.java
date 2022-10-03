package Sprint_1.Övning_2b;

public class Båt extends FordonAbstrakt {
    private double dödvikt;

    public Båt() {
    }

    public Båt(double dödvikt) {
        this.dödvikt = dödvikt;
    }

    public Båt(int hastighet, double vikt, double dödvikt) {
        setHastighet(hastighet);
        setVikt(vikt);
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

    public void printMe() {
        System.out.println("Denna båt har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram, dödvikt på " +
                getDödvikt() + " kilogram.");
    }
}