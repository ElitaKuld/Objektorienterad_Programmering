package Sprint_1.Hederlige_Harry;

public class BilAnnons extends FordonsAnnons{

    private String färg;
    private boolean sommardäck;
    private boolean vinterdäck;

    public BilAnnons(){}

    public BilAnnons(String färg, boolean sommardäck, boolean vinterdäck) {
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }

    public BilAnnons(int pris, String rubrik, int årsmodell, int antalMil, String färg, boolean sommardäck, boolean vinterdäck) {
        super(pris, rubrik, årsmodell, antalMil);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public boolean isSommardäck() {
        return sommardäck;
    }

    public void setSommardäck(boolean sommardäck) {
        this.sommardäck = sommardäck;
    }

    public boolean isVinterdäck() {
        return vinterdäck;
    }

    public void setVinterdäck(boolean vinterdäck) {
        this.vinterdäck = vinterdäck;
    }

    @Override
    public void getAnnonsText() {
        System.out.println(getRubrik() + ", årsmodell " + getÅrsmodell() + ", färg: " + getFärg() + ", antal mil: " +
                getAntalMil() + " mil, har sommardäck: " + isSommardäck() + ", har vinterdäck: " +isVinterdäck() +
                ", pris: " + getPris() + " kronor. " + getBeskrivning());
    }
}
/*• Skapa nu en klass BilAnnons som ärver från FordonsAnnons. Den ska ha lite mer information,
tex Färg, Sommardäck (J/N), Vinterdäck (J/N)*/