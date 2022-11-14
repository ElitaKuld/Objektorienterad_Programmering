package Sprint_4.Övning_13;

import java.io.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class URLEngelskaOrd {
    public static void main(String[] args) throws IOException {
        URLEngelskaOrd engelska = new URLEngelskaOrd();
        URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        List<String> listaMedOrd = new LinkedList<>(); // skapa en lista med alla orden från webbsidan
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            listaMedOrd.add(inputLine);
        in.close();

        System.out.println("Denna url innehåller " + listaMedOrd.size() + " engelska ord."); // räkna orden från urlen/på listan

        System.out.println("Det längsta ordet är: " + engelska.hittaLängstaOrdet(listaMedOrd) + ", vilket består av " +
                engelska.hittaLängstaOrdet(listaMedOrd).length() + " bokstäver.");

        int[] längdPåOrd = engelska.analyseraLista(listaMedOrd);
        for (int i : längdPåOrd)
            System.out.println(i);
        for (int i : engelska.convertArrayToList(längdPåOrd))
            System.out.println(i);
        engelska.skrivUtSammanfattning(längdPåOrd);
    }

    public String hittaLängstaOrdet(List<String> lista) {
        String längstaOrdet = "";
        int maxLängd = 0;
        for (String ord : lista) {
            if (ord.length() > maxLängd) {
                maxLängd = ord.length();
                längstaOrdet = ord;
            }
        }
        return längstaOrdet;
    }

    public int[] analyseraLista(List<String> lista) {
        int[] array = new int[50];
        for (String ord : lista) {
            array[ord.length()]++;
        }
        return array;
    }

    public void skrivUtSammanfattning(int[] array) {
        System.out.println("Bland alla orden från urlen fanns det: ");
        List<Integer> lista = convertArrayToList(array);
        for (int i = 1; i < lista.size() && lista.get(i) != 0; i++) {
                System.out.println(lista.get(i) + " ord med " + lista.indexOf(lista.get(i)) + " bokstäver.");
        }
    }

    public List<Integer> convertArrayToList(int[] array) {
        List<Integer> lista = new LinkedList<>();
        for (int i : array)
            lista.add(i);
        return lista;
    }
}
/*Gör ett program som läser in ord från URL:en https://github.com/dwyl/english-words/blob/master/words.txt?raw=true
och skriver ut hur många ord det finns med varje längd. (filen
består av alla engelska ord, 466 544 st)*/