package Sprint_4.Övning_15a;

import java.util.LinkedList;
import java.util.List;

public class MinKö<E> implements KöInterface<E> {

    private List<E> lista = new LinkedList<>();

    public MinKö() {
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

    @Override
    public synchronized void put(E content) {
        lista.add(content);
        notify();
    }

    @Override
    public synchronized E take() { // använder man sig av wait viktigt att lägga till synchronized i metoden annars får man: IllegalMonitorStateException: current thread is not owner
        while (lista.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException exception) {
                return null;
            }
        }
        E content = lista.get(0);
        lista.remove(0);
        return content;
    }

    @Override
    public int size() {
        return lista.size();
    }
}
/*Gör ett generiskt kö-interface med följande metoder:
• put
• take
• size
Skriv den implementerande kö-klassen*/