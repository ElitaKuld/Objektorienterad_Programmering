package Sprint_2.Övning_6c;

public class Valör {

    private int antal;
    private int valörVärde;

    public Valör(){};

    public Valör(int valörVärde) {
        this.valörVärde = valörVärde;
        this.antal = 1;
    }

    public Valör(int antal, int valör) {
        this.antal = antal;
        this.valörVärde = valör;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getValörVärde() {
        return valörVärde;
    }

    public void setValörVärde(int valör) {
        this.valörVärde = valör;
    }
}