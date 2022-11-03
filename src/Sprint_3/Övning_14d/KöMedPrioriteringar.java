package Sprint_3.Övning_14d;

import Sprint_3.Övning_14a.MyQueue;
import Sprint_3.Övning_14b.Consumer;
import Sprint_3.Övning_14b.Producer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KöMedPrioriteringar {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många producenter ska startas upp?");
        int antalProducenter = scan.nextInt();
        System.out.println("Med vilket intervall ska varje producent lägga saker i kön?");
        int timeProducent = scan.nextInt();
        System.out.println("Hur många konsumenter ska startas upp?");
        int antalKonsumenter = scan.nextInt();
        System.out.println("Med vilket intervall ska varje konsument plocka saker från kön?");
        int timeKonsument = scan.nextInt();

        int nuvarandeAntal = 0;
        String ordProducent = "";
        MyQueue queue = new MyQueue();

        List<Producer> listaProducenter = new LinkedList<>();

        while (nuvarandeAntal < antalProducenter) {
            System.out.println("Vilket ord ska denna producent lägga in i kön?");
            ordProducent = scan.next();
            System.out.println("Vilken prioriteringsordning vill du ge denna producent?");
            int prioritet = scan.nextInt();
            Producer producent = new Producer(ordProducent, timeProducent, queue);
            producent.setPriority(prioritet);
            listaProducenter.add(producent);
            nuvarandeAntal++;
        }

        for (Producer producent : listaProducenter) {
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
/*Förbättra koden så att producenten lägger in objekten i prioritetsordning efter vilken prioritet den tråd
som lägger in objekt i kön har. Nu måste användaren även lägga till prio för varje producent i
huvudprogrammet
Ändra Konsument-klassen så att även prioriteten skrivs ut när ett objekt tas ur kön
Kör och kontrollera att allt funkar, strängar som produceras med högst prio ska hämtas ur kön och
skrivas ut först.*/