package Sprint_3.Övning_14d;

import java.util.Scanner;

public class HuvudProgram {
    public static void main(String[] args) throws InterruptedException {
        SimpleQueue queue = new SimpleQueue();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hur många producenter ska startas upp?");
        int antalProducenter = scan.nextInt();
        Producer[] antalProducer = new Producer[antalProducenter];

        for (int i = 0; i < antalProducer.length; i++) {
            System.out.println("Producent no " + (i + 1) + ":");
            System.out.println("Med vilket intervall ska denna producent lägga saker i kön?");
            int timeProducent = scan.nextInt();
            System.out.println("Vilken prioriteringsordning vill du ge denna producent (1 till 10)?");
            int prioritet = scan.nextInt();
            System.out.println("Vilket ord ska denna producent lägga in i kön?");
            String ordProducent = scan.next();
            antalProducer[i] = new Producer(ordProducent, timeProducent, prioritet, queue);
        }

        System.out.println("Hur många konsumenter ska startas upp?");
        int antalKonsumenter = scan.nextInt();
        Consumer[] antalConsumer = new Consumer[antalKonsumenter];
        for (int i = 0; i < antalConsumer.length; i++) {
            System.out.println("Med vilket intervall ska denna konsument plocka saker från kön?");
            int timeKonsument = scan.nextInt();
            antalConsumer[i] = new Consumer(timeKonsument, queue);
        }

        for (Producer producer : antalProducer) {
            producer.start();
        }

        for (Consumer consumer : antalConsumer) {
            consumer.start();
        }

        Thread.sleep(10000); // 10 sekunder
        System.out.println("Antal kvar i kön " + queue.size());
        queue.printQueue();

        System.exit(0);
    }
}
/*Förbättra koden så att producenten lägger in objekten i prioritetsordning efter vilken prioritet den tråd
som lägger in objekt i kön har. Nu måste användaren även lägga till prio för varje producent i
huvudprogrammet
Ändra Konsument-klassen så att även prioriteten skrivs ut när ett objekt tas ur kön
Kör och kontrollera att allt funkar, strängar som produceras med högst prio ska hämtas ur kön och
skrivas ut först.*/