package Sprint_1.Övning_6;

import java.util.ArrayList;

public class HuvudprogramDjur {
    public static void main(String[] args) {
        HuvudprogramDjur hd = new HuvudprogramDjur();
        Katt katt = new Katt();
        Orm orm = new Orm();
        Näktergal näktergal = new Näktergal();
        Sparkling_Gourami sparkling_gourami = new Sparkling_Gourami();


        ArrayList<Djur> allaDjur = new ArrayList<>();
        allaDjur.add(katt);
        allaDjur.add(orm);
        allaDjur.add(näktergal);
        allaDjur.add(sparkling_gourami);

        hd.skrivUtListaMedDjur(allaDjur);
    }

    public void skrivUtListaMedDjur(ArrayList<Djur> allaDjur) {
        for (int i = 0; i < allaDjur.size(); i++) {
            System.out.print(allaDjur.get(i).getNamn() + " ");
            allaDjur.get(i).läte();
        }
    }
}

/*Olika sorters djur kan beskrivas med hjälp av klasser och arv. Definiera några olika djur. Utgå från en
abstrakt klass Djur och härled de olika djuren från denna. Använd gärna mellanliggande klasser som
t.ex Däggdjur, Kräldjur, Fågel, Fisk etc.
Låt klassen Djur ha en abstrakt metod ”läte” som beskriver hur ett djur låter. Implementera denna
metod i subklasserna. Deklarera sedan en array eller lista med djur och skriv satser för att löpa igenom
arrayen och låta alla djuren ge ifrån sig ett läte.*/