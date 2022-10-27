package Sprint_3.Övning_14c;

import Sprint_3.Övning_14a.MyQueue;
import Sprint_3.Övning_14b.Consumer;
import Sprint_3.Övning_14b.Producer;

import java.util.Scanner;

public class KöHuvudprogram {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många producenter ska startas upp?");
        int antalProducenter = scan.nextInt();
        System.out.println("Hur många konsumenter ska startas upp?");
        int antalKonsumenter = scan.nextInt();
        System.out.println("Med vilket intervall ska varje producent lägga saker i kön?");
        int timeProducent = scan.nextInt();
        System.out.println("Vilket ord ska varje producent lägga in i kön?");
        String ordProducent = scan.next();
        System.out.println("Med vilket intervall ska varje konsument plocka saker från kön?");
        int timeKonsument = scan.nextInt();

        MyQueue queue = new MyQueue();

        for (int i = 1; i <= antalProducenter; i++) {
            Producer producent = new Producer(ordProducent, timeProducent, queue);
            producent.start();
        }

        for (int i = 1; i <= antalKonsumenter; i++) {
            Consumer konsument = new Consumer(timeKonsument, queue);
            konsument.start();
        }

        Thread.sleep(10000); // 10 sekunder

        for (int i = 0; i < queue.getLista().size(); i++) {
            System.out.println(queue.getLista().get(i));
        }
        System.exit(0);
    }
}
/*Gör ett huvudprogram som frågar användaren:
Hur många producenter som ska startas upp
Hur många konsumenter som ska startas upp
Med vilket intervall varje producent ska lägga saker i kön
Vilket ord varje producent ska lägga i kön
Med vilket intervall varje konsument ska plocka saker från kön
Starta sedan upp det antal producenter och konsumenter som angivits och låt dem köra. Alla ska ta
samma kö son inparameter.
Låt programmet köra i 10 sek, skriv sedan ut status på kön och avsluta.
*/