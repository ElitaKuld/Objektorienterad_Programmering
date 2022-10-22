package Sprint_2.Övning_7;

import java.util.Scanner;

public class RäntaPåRänta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange saldo på kontot?");
        double kapital = scan.nextDouble();
        System.out.println("Ange räntesats?");
        int ränta = scan.nextInt();
        System.out.println("Ange antal år som pengarna ska ligga på kontot?");
        int antalÅr = scan.nextInt();
        System.out.println(" 0     100,00");
        for (int år = 1; år <= antalÅr; år ++){
            kapital = kapital + kapital * ränta * 0.01;
            System.out.printf("%2d %10.2f \n", år, kapital);
        }
    }
}
/*Skriv ett program som visar hur kapital förräntar sig över ett antal år givet startkapital, räntesats och
antal år. Uppgiften behöver inte lösas med hjälp av rekursion. Skriv ut resultatet i en tabell med
högercentrerade kolumner och där summorna anges med 2 decimaler. Exempel på utskrift för 100 kr
insatta med 10% ränta över 10 år:*/