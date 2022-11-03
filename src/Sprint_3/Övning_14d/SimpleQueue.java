package Sprint_3.Övning_14d;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueue {
    private List<QueueElement> lista = new ArrayList<QueueElement>();

    public int size() {  // ger antalet element i kön
        return lista.size();
    }

    public synchronized void put(QueueElement element) {
        System.out.println("Jag har lagt ordet " + element.getText() + " i kön");
        int priority = Thread.currentThread().getPriority();
        //alternativt sätt att ta fram prioriteten:
        //int priority = element.getPriority();
        int i;

        //leta baklänges i kön tills rätt prio hittas
        // i kommer att tilldelas värdet på den plats före där vi vill lägga in vårt objekt
        for (i = size() - 1; i >= 0 && priority > ((QueueElement) lista.get(i)).getPriority(); i--)
            ;
        lista.add(i + 1, element);
        notify();
    }

    public synchronized QueueElement take() { // tar ut första elementet
        while (lista.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
        QueueElement element = (QueueElement) lista.get(0);
        lista.remove(0);
        return element;
    }

    public void printQueue() {
        lista.forEach(objekt -> System.out.println(objekt.getText()));
    }
}