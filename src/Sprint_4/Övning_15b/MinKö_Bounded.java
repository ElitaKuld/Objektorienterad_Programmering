package Sprint_4.Övning_15b;

import Sprint_4.Övning_15a.KöInterface;

import java.util.LinkedList;
import java.util.List;

public class MinKö_Bounded<E extends Number> implements KöInterface<E> {

    private List<E> lista = new LinkedList<>();

    public MinKö_Bounded() {
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

    public int sumOfDigits() {
        int summa = 0;
        for (E e : lista) {
            int digit = (int) e;
            summa = summa + digit;
        }
        return summa;
    }

    public E sumOfDigitsVersionTwo() {
        try {
            if (lista.get(0).getClass() == Integer.class) {
                Integer summa = 0;
                for (E e : lista) {
                    summa = summa + e.intValue();
                }
                return (E) summa;
            }
            if (lista.get(0).getClass() == Long.class) {
                Long summa = 0L;
                for (E e : lista) {
                    summa += e.longValue();
                }
                return (E) summa;
            }
            if (lista.get(0).getClass() == Double.class) {
                Double summa = 0.0;
                for (E e : lista) {
                    summa += e.doubleValue();
                }
                return (E) summa;
            }
        } catch (IndexOutOfBoundsException e) {
            //Listan var tom
            Integer tomLista = 0;
            return (E) tomLista;
        }
        //Hit kommer vi om våra tal var av annan typ, t.ex float, BigInteger
        Integer annanTyp = 0;
        return (E) annanTyp;
    }
}
/*Gör även en begränsad kö-klass, som bara hanterar objekt som motsvarar siffror, men som ändå
implementerar interfacet ovan.
Lägg till en metod som summerar alla siffrorna i kön
*/