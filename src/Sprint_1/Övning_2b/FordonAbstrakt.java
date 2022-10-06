package Sprint_1.Övning_2b;

public abstract class FordonAbstrakt {

    private int hastighet;
    private double vikt;

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

    public abstract void printMe();
}