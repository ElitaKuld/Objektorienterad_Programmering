package Sprint_3.Övning_13;

public class Medicine extends Thread {

    private String namn;
    private int antalGånger;

    public Medicine(String namn, int antalGånger) {
        this.namn = namn;
        this.antalGånger = antalGånger;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(räknaUtInterval(antalGånger));
                System.out.println("Ta medicin " + namn + " nu.");
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    public int räknaUtInterval(int antalGånger) {
        return (int) (60 * 1000 / antalGånger);
    }
}