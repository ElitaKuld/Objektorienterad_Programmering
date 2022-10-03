package Sprint_1.Övning_4;

public class Kurs {
    private String namn;
    private Lärare lärare;

    public Kurs(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }
}