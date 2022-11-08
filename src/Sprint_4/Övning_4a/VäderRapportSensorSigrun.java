package Sprint_4.Övning_4a;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class VäderRapportSensorSigrun {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String stadsNamn = JOptionPane.showInputDialog("Vilken stad befinner du dig i?");
        if (stadsNamn == null || stadsNamn.length() == 0) {  //tar hand om Cancel-tryck
            System.exit(0);
        }

        InetAddress toAdress = InetAddress.getLocalHost();
        int toPort = 32388;
        DatagramSocket socket = new DatagramSocket();

        while (true) {
            System.out.println("Vilken temperatur är det just nu?");
            String temperatur = scan.nextLine();
            String dataToSend = "Stad: " + stadsNamn + ", temperatur: " + temperatur;
            byte[] data = dataToSend.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdress, toPort);
            socket.send(packet);
        }
    }
}