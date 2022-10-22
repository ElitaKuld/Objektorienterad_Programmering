package Sprint_2.Övning_6d;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataReader {

    static int mockPrice = 55;
    static int mockAmount = 500;

    static Scanner scan = new Scanner(System.in);

    public static int readPrice(boolean testLäge) {
        int price;
        if (testLäge)
            price = mockPrice;
        else {
            while (true) {
                System.out.println("Ange det pris du ska betala?");
                if (!scan.hasNextLine()) {
                    System.out.println("Du har avbrutit programmet");
                    System.exit(0);  // Användaren klickade på "Avbryt"
                }
                try {
                    price = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Felaktigt tal.");
                    scan.nextLine();
                } catch (Exception e) {
                    System.out.println("Ospecifierat fel inträffade, försök igen!");
                    scan.nextLine();
                }
            }
        }
        return price;
    }

    public static int readAmount(boolean testLäge) {
        int amount;
        if (testLäge)
            amount = mockAmount;
        else {
            while (true) {
                System.out.println("Ange det belopp du betalar med?");
                if (!scan.hasNextLine()) {
                    System.out.println("Du har avbrutit programmet");
                    System.exit(0);  // Användaren klickade på "Avbryt"
                }
                try {
                    amount = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Felaktigt tal.");
                    scan.nextLine();
                } catch (Exception e) {
                    System.out.println("Ospecifierat fel inträffade, försök igen!");
                    scan.nextLine();
                }
            }
        }
        return amount;
    }
}
