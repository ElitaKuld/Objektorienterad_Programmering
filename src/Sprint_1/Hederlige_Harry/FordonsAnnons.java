package Sprint_1.Hederlige_Harry;

public class FordonsAnnons {

    private int pris; //4
    private String rubrik; //1
    private String beskrivning; //5
    private int årsmodell; //2
    private int antalMil; //3

    public FordonsAnnons(){}

    public FordonsAnnons(int pris, String rubrik, int årsmodell, int antalMil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public int getAntalMil() {
        return antalMil;
    }

    public void setAntalMil(int antalMil) {
        this.antalMil = antalMil;
    }

    public void getAnnonsText() {
        System.out.println(getRubrik() + ", årsmodell " + getÅrsmodell() + ", antal mil: " + getAntalMil() + " mil, pris: " +
                getPris() + " kronor. " + getBeskrivning());
    }
}
/* Vi börjar med FordonsAnnons. Alla fordon bör ha ett pris, en rubrik, en beskrivning, årsmodell, antalmil etc.
Dessutom ska vi ha en funktion string GetAnnonsText() som ska generera själva annonstexten som ska visas,
tex en grym Volvo 240 Årsmodell 1981, Röd, 49000 mil 249000 kr En perfekt bil för den händige till ett fantastiskt pris. */