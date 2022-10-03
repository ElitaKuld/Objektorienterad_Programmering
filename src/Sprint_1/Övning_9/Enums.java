package Sprint_1.Övning_9;

public class Enums {
    public static void main(String[] args) {
        for (int i = 1; i <= RomerskSiffra.M.getUppräkningsOrder(); i++) {
            int värdeISiffror = RomerskSiffra.I.getSiffervärdeFrånOrder(i);
            System.out.println(värdeISiffror);
        }

        System.out.println();


        for (RomerskSiffra siffra : RomerskSiffra.values()) {
            System.out.println("Romerska siffran " + siffra + " betyder " + siffra.getSiffervärde());
        }
    }
}
/*De romerska siffrorna anges med bokstäverna I, V, X, L, C, D och M som står för 1, 5, 10, 50, 100,
500 resp. 1000.
Deklarera en uppräkningstyp Romersk siffra som innehåller uppräkningsvärdena I, V, X, L, C, D och
M. För varje uppräkningsvärde ska det finnas en instansvariabel som innehåller motsvarande
siffervärde.
I ditt huvudprogram, iterera över konstanterna i uppräkningen och skriv ut vad varje romersk siffra har
för värde.*/