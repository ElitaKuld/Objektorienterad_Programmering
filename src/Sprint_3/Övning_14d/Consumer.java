package Sprint_3.Övning_14d;

public class Consumer extends Thread {

    private int time;
    private SimpleQueue queue;

    public Consumer() {
    }

    public Consumer(int time, SimpleQueue queue) {
        this.time = time;
        this.queue = queue;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public SimpleQueue getQueue() {
        return queue;
    }

    public void setQueue(SimpleQueue queue) {
        this.queue = queue;
    }

    @Override
    public synchronized void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(time);
                QueueElement element = (QueueElement) queue.take();
                System.out.println("Jag har plockat ordet " + element.getText() + " från kön.");
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
}