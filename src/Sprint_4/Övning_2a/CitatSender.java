package Sprint_4.Övning_2a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.List;

public class CitatSender {
    public static void main(String[] args) throws IOException {
        List<String> citat = new LinkedList<>();
        citat.add("All we have to decide is what to do with the time that is given to us.");
        citat.add("""
                All that is gold does not glitter,
                Not all those who wander are lost;
                The old that is strong does not wither,
                Deep roots are not reached by frost.""");
        citat.add("There is some good in this world, and it’s worth fighting for.");
        citat.add("Even the smallest person can change the course of the future.");
        citat.add("A single dream is more powerful than a thousand realities.");

        InetAddress toAdress = InetAddress.getLocalHost();
        int toPort = 52525;
        DatagramSocket socket = new DatagramSocket();
        for (String message : citat) {
            byte[] data = message.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdress, toPort);
            socket.send(packet);
        }
    }
}
/*Skapa ett sändar-program som sänder ut ett tänkvärt citat i minuten via datagram (skriv ner ca 5 citat
och lägg utsändningen i en loop). Skapa ett mottagarprogram som tar emot citaten och skriver ut dem
på consolen.*/