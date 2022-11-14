package Sprint_4.Övning_4b;

import javax.swing.*;
import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;

public class VäderRapportMottagare_Multicast extends JFrame {
    JPanel basPanel = new JPanel();
    JTextArea rapportArea = new JTextArea(10, 30);
    JScrollPane scroll = new JScrollPane(rapportArea);

    int minPort = 32335;
    MulticastSocket socket = new MulticastSocket(minPort);
    InetAddress toAdress = InetAddress.getByName("234.234.234.234");
    InetSocketAddress group = new InetSocketAddress(toAdress, minPort);
    NetworkInterface netIf = NetworkInterface.getByName("wlan2");

    public VäderRapportMottagare_Multicast() throws IOException {
        socket.joinGroup(group, netIf);

        add(basPanel);
        this.setTitle("Väderrapport");
        basPanel.add(scroll);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Receiver del
        byte[] data = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            rapportArea.append(message + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        VäderRapportMottagare_Multicast väder = new VäderRapportMottagare_Multicast();
    }
}/*Gör en multicast-variant av vädersystemet I uppgift 4a.
Låt varje sändarprogram bestå av ett litet Swingprogram där användaren skriver in stad och temp i två
JTextFields
När användaren trycker enter skickas stad och temp till mottagarprogrammet
Låt mottagaren också vara ett litet Swingprogram, som skriver ut sina mottagna meddelanden i en
JTextArea
Mottagaren ska lyssna till en multicast adress och kunna ta emot data från hela klassens sändare.*/