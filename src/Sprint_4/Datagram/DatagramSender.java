package Sprint_4.Datagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSender {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InetAddress toAdress = InetAddress.getLocalHost();
        int toPort = 32335;
        DatagramSocket socket = new DatagramSocket();
        String message;
        System.out.println("Vad har du på hjärtat?");
        while ((message = reader.readLine()) != null) {
            if (message.equals("bye")) System.exit(0);
            byte[] data = message.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdress, toPort);
            socket.send(packet);
            System.out.println("Vad har du på hjärtat?");
        }
        System.exit(0);
    }
}