package Sprint_3.Övning_14a;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {

    private List<Object> lista = new LinkedList<>();


    public MyQueue() {
    }

    public List<Object> getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }

    public synchronized void put(Object object) {
        lista.add(object);
        notify();
    }

    public synchronized Object take() {
        while (lista.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException exception) {
                return null;
            }
        }
        Object object = lista.get(0);
        lista.remove(0);
        return object;
    }
}
/*Skriv en egen Kö-klass, MyQueue.
Kön ska ha följande funktioner:
void put(Object o) – Objektet o läggs in sist i kön
Object take() – returnerar det objekt som ligger först i kön
Använd dig av wait() i take, om inget objekt finns i kön ska den tråd som vill hämta ett objekt få vänta
Använd dig av notify() i put, när det kommer ett objekt till kön ska de väntande trådarna notifieras.
Denna kod finns i föreläsningarna/filmerna*/