package Sprint_3.Övning_14b;

import Sprint_3.Övning_14a.MyQueue;

public class Producer extends Thread {

    private String string;
    private int time;
    private MyQueue queue;

    public Producer() {
    }

    public Producer(String string, int time, MyQueue queue) {
        this.string = string;
        this.time = time;
        this.queue = queue;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
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
                queue.put(string);
                System.out.println("Jag har lagt ordet " + string + " i kön");
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