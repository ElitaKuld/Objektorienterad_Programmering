package Sprint_2.Övning_9b;

public class Person {
    String namn;
    String adress;
    String bostadsort;
    int ålder;
    int vikt;
    int längd;

    public Person() {
    }

    public Person(String namn, String adress, String bostadsort, int ålder, int vikt, int längd) {
        this.namn = namn;
        this.adress = adress;
        this.bostadsort = bostadsort;
        this.ålder = ålder;
        this.vikt = vikt;
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBostadsort() {
        return bostadsort;
    }

    public void setBostadsort(String bostadsort) {
        this.bostadsort = bostadsort;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public int getLängd() {
        return längd;
    }

    public void setLängd(int längd) {
        this.längd = längd;
    }

    @Override
    public String toString() {
        return this.namn + ", " + this.adress + ", " + this.bostadsort + ", " + this.ålder + ", " + this.vikt + ", " + this.längd;
    }
}