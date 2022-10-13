package Sprint_2.Övning_3;

import java.util.Scanner;

public class HuvudprogramHärmapa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Skriv en mening?");
            if (!scan.hasNextLine()) {
                System.out.println("Du hat avbrutit programmet.");
                break;
            }
            String mening = scan.nextLine();
            System.out.println("Du skrev: " + mening);
        }
    }
}
/*Gör ett program där du läser in det du själv skriver på kommandoraden, och skriver ut det igen
Varje gång du trycker “enter” ska inläsning av hela den rad du skrivit läsas in med en Scanner.
Skriv ut “Du skrev: ” följt av det du faktiskt skrev. Du behöver inte jobba testdrivet i denna uppgift,
den är bara till för att du ska få scannern att funka.*/
