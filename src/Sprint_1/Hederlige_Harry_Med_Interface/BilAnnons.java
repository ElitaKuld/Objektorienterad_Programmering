package Sprint_1.Hederlige_Harry_Med_Interface;

public class BilAnnons extends FordonsAnnons {

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
    public void printCompleteAdd() {
        System.out.println(getRubrik() + ", årsmodell " + getÅrsmodell() + ", färg: " + getFärg() + ", antal mil: " +
                getAntalMil() + " mil, har sommardäck: " + isSommardäck() + ", har vinterdäck: " +isVinterdäck() +
                ", pris: " + getPris() + " kronor. " + getBeskrivning());
    }
    @Override
    public void printHeader(){
        System.out.println(getRubrik() + ", " + getPris() + " kronor.");
    }

    @Override
    public double calculateRevenue(){
        return getPris() * 0.75;
    }
}