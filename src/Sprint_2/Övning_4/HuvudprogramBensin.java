package Sprint_2.Övning_4;

import java.util.Scanner;

public class HuvudprogramBensin {
    public static void main(String[] args) {
        Bil bil = new Bil();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange en bils mätarställning för idag?");
        bil.setAmountMilesToday(scan.nextDouble());
        System.out.println("Ange en bils mätarställning för ett år sedan?");
        bil.setAmountMilesAYearAgo(scan.nextDouble());
        System.out.println("Ange antal liter bensin som förbrukats under året?"); // OBS! Double anges med en decimalkomma!
        bil.setAmountGasolineUsed(scan.nextDouble());
        double amountMiles = bil.getAmountMile();
        double amountGasoline = bil.getAmountGasoline(amountMiles);
        System.out.println(bil.getAmountMilePrintout(amountMiles));
        System.out.println(bil.getAmountGasolinePrintout(bil.getAmountGasolineUsed()));
        System.out.println(bil.getAmountGasolinePerMilePrintout(amountGasoline));
    }
}
/*Kopiera uppgift 2 (inklusive tester). Du ska nu refaktorera ditt program så att du använder Scanner,
som läser från System.in, istället för JOptionPane.
Utskriften ska ske i kommandofönstret och ha formatet:
Antal körda mil: 1487
Antal liter bensin: 1235,4
Förbrukning per mil: 0,83
Använd dig av testerna för att kontrollera att du inte förstört något i programmet under
refaktoreringen.*/