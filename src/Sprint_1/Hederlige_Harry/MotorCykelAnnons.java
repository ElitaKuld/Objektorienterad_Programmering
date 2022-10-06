package Sprint_1.Hederlige_Harry;

public class MotorCykelAnnons extends FordonsAnnons {

    private int motorvolym;
    public String drivtyp;

    public MotorCykelAnnons(){}

    public MotorCykelAnnons(int motorvolym, String drivtyp) {
        this.motorvolym = motorvolym;
        this.drivtyp = drivtyp;
    }

    public MotorCykelAnnons(int pris, String rubrik, int årsmodell, int antalMil, int motorvolym, String drivtyp) {
        super(pris, rubrik, årsmodell, antalMil);
        this.motorvolym = motorvolym;
        this.drivtyp = drivtyp;
    }

    public int getMotorvolym() {
        return motorvolym;
    }

    public void setMotorvolym(int motorvolym) {
        this.motorvolym = motorvolym;
    }

    public String getDrivtyp() {
        return drivtyp;
    }

    public void setDrivtyp(String drivtyp) {
        this.drivtyp = drivtyp;
    }

    @Override
    public void getAnnonsText() {
        System.out.println(getRubrik() + ", årsmodell " + getÅrsmodell() + ", antal mil: " + getAntalMil() + " mil, motorvolym: " +
                getMotorvolym() + " cm\u00B3" + ", drivtyp: " + getDrivtyp() + ", pris: " + getPris() + " kronor. " + getBeskrivning());
    }
}
/*Och sist en klass MotorCykelAnnons som också ärver från FordonsAnnons. Den kan ha Motorvolym (ex 800 cm3), Drivtyp (kardan/kedja).*/