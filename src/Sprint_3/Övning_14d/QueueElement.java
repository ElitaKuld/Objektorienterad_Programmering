package Sprint_3.Övning_14d;

public class QueueElement {
    private String text;
    private int priority;

    public QueueElement(String ord, int prioritet) {
        text = ord;
        this.priority = prioritet;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}