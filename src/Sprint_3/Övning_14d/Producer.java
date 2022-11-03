package Sprint_3.Övning_14d;

public class Producer extends Thread {
    private int time;
    private SimpleQueue queue;
    private QueueElement element;
    private int priority;

    public Producer() {
    }

    public Producer(String ord, int sekunder, int prioritet, SimpleQueue queue) {
        this.time = sekunder * 1000;
        this.queue = queue;
        this.priority = prioritet;
        this.element = new QueueElement(ord, prioritet);
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

    public QueueElement getElement() {
        return element;
    }

    public void setElement(QueueElement element) {
        this.element = element;
    }

    @Override
    public synchronized void run() {
        setPriority(getPriority());
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(time);
                queue.put(getElement());
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
}