package Sprint_1.Övning_2a;

public class Fordon {
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
    public String toString() {
        return "Detta fordon har hastighet på " + getHastighet() + " km/h och vikt på " + getVikt() + "kilogram.";
    }
}

/*Implementera följande klassdiagram. Detta sätt att rita kallas UML och är vanligt förekommande för
att illustrera klasshierarkier. Överst, i varje ruta, står klassnamnet på de klasser ni ska skriva. I mitten
finns instansvariablerna. Nederst instansmetoderna i varje klass. Triangeln betyder att nedanstående
klasser ärver ovanstående.
Ni ska alltså skriva nedanstående 5 klasser, med de instansvariabler och instansmetoder som anges
(och också arvet). Ni behöver inte lägga tid på vettig kod för ”sväng”-metoden.
Testa att använda superkonstruktorn.*/