package Sprint_1.Hederlige_Harry_Med_Interface;

public class HusvagnsAnnons extends FordonsAnnons {

    private boolean dusch;
    private int antalBäddar;

    public HusvagnsAnnons(){}

    public HusvagnsAnnons(boolean dusch, int antalBäddar) {
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
    }

    public HusvagnsAnnons(int pris, String rubrik, int årsmodell, int antalMil, boolean dusch, int antalBäddar) {
        super(pris, rubrik, årsmodell, antalMil);
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
    }

    public boolean isDusch() {
        return dusch;
    }

    public void setDusch(boolean dusch) {
        this.dusch = dusch;
    }

    public int getAntalBäddar() {
        return antalBäddar;
    }

    public void setAntalBäddar(int antalBäddar) {
        this.antalBäddar = antalBäddar;
    }

    @Override
    public void printCompleteAdd() {
        System.out.println(getRubrik() + ", årsmodell " + getÅrsmodell() + ", antal mil: " + getAntalMil() + " mil, antal bäddar: " +
                getAntalBäddar() + ", har dusch: " + isDusch() + ", pris: " +
                getPris() + " kronor. " + getBeskrivning());
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