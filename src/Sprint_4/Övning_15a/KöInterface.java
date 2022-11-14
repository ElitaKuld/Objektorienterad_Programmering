package Sprint_4.Övning_15a;

public interface KöInterface<E> {

    public void put(E content);

    public E take();

    public int size();

}/*Gör ett generiskt kö-interface med följande metoder:
• put
• take
• size
Skriv den implementerande kö-klassen*/