package Sprint_2.Övning_10;

public class Stad {
    String namn;
    String tidszon;

    public Stad(){}

    public Stad(String namn, String tidszon) {
        this.namn = namn;
        this.tidszon = tidszon;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getTidszon() {
        return tidszon;
    }

    public void setTidszon(String tidszon) {
        this.tidszon = tidszon;
    }
}