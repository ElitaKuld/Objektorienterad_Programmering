package Sprint_3.Övning_14b;

import Sprint_3.Övning_14a.MyQueue;

public class Consumer extends Thread {

    private int time;
    private MyQueue queue;

    public Consumer() {
    }

    public Consumer(int time, MyQueue queue) {
        this.time = time;
        this.queue = queue;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public MyQueue getQueue() {
        return queue;
    }

    public void setQueue(MyQueue queue) {
        this.queue = queue;
    }

    @Override
    public synchronized void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(time);
                String string = (String) queue.take();
                System.out.println("Jag har plockat ordet " + string + " från kön." +
                        " Detta ord har prioritet: " + this.getPriority());
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
}
/*Skriv två ytterligare klasser
Producer (String s, int time, MyQueue q)
Consumer (int time, MyQueue q)
Varje instans av dessa ska exekvera i en egen tråd.
Producenten lägger in strängar i kön i det tidsintervall som anges i time-variabeln. Gör en utskrift när
producenten har lagt sitt ord i kön
Konsumenten plockar ut strängar ur kön i det tidsintervall som anges i time-variabeln. Gör en utskrift
när konsumenten har plockat ett ord från kön. Interaktionerna med kön ska vara synkroniserade*/