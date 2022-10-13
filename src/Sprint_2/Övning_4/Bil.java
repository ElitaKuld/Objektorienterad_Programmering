package Sprint_2.Övning_4;

public class Bil {

    private double amountMilesToday;
    private double amountMilesAYearAgo;
    private double amountGasolineUsed;

    public Bil(){};

    public Bil(double amountMilesToday, double amountMilesAYearAgo, double amountGasolineUsed) {
        this.amountMilesToday = amountMilesToday;
        this.amountMilesAYearAgo = amountMilesAYearAgo;
        this.amountGasolineUsed = amountGasolineUsed;
    }

    public double getAmountMilesToday() {
        return amountMilesToday;
    }

    public void setAmountMilesToday(double amountMilesToday) {
        this.amountMilesToday = amountMilesToday;
    }

    public double getAmountMilesAYearAgo() {
        return amountMilesAYearAgo;
    }

    public void setAmountMilesAYearAgo(double amountMilesAYearAgo) {
        this.amountMilesAYearAgo = amountMilesAYearAgo;
    }

    public double getAmountGasolineUsed() {
        return amountGasolineUsed;
    }

    public void setAmountGasolineUsed(double amountGasolineUsed) {
        this.amountGasolineUsed = amountGasolineUsed;
    }

    public double getAmountMile() {
        return this.amountMilesToday - this.amountMilesAYearAgo;
    }

    public double getAmountGasoline(double amountMiles) {
        return this.amountGasolineUsed / amountMiles;
    }

    public String getAmountMilePrintout(double amount){
        return "Antal körda mil: " + amount;
    }

    public String getAmountGasolinePrintout (double gasoline){
        return "Antal liter bensin: " + gasoline;
    }

    public String getAmountGasolinePerMilePrintout(double gasolinePerMile){
        return "Förbrukning per mil: " + gasolinePerMile;
    }
}