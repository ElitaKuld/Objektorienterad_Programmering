package Sprint_4.Datagram_Multicast;

import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;

public class MulticastReceiver {
    public static void main(String[] args) throws IOException{
        int minPort = 32335;
        MulticastSocket socket = new MulticastSocket(minPort); // ändrat i Multicast version
        byte[] data = new byte[256];

        InetAddress toAdress = InetAddress.getByName("234.234.234.234"); // tillagd i Multicast version
        InetSocketAddress group = new InetSocketAddress(toAdress,minPort); // tillagd i Multicast version
        NetworkInterface netIf = NetworkInterface.getByName("wlan2"); // tillagd i Multicast version

        socket.joinGroup(group, netIf); // tillagd i Multicast version

        while(true){
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Meddelande från "+ packet.getAddress().getHostAddress() + " " +LocalDateTime.now());
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);
        }
    }
}