package Sprint_1.Övning_6;

public abstract class Djur {

    public String namn;

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    abstract void läte();
}