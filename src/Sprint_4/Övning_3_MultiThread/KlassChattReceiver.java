package Sprint_4.Övning_3_MultiThread;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

public class KlassChattReceiver implements Runnable {
    Thread aktivitet = new Thread(this);
    MulticastSocket socket;
    JTextArea chattArea;

    KlassChattReceiver(MulticastSocket socket, JTextArea area) {
        this.socket = socket;
        chattArea = area;
        aktivitet.start();
    }

    @Override
    public void run() {
        byte[] data = new byte[1024];
        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String(data, 0, packet.getLength());
                synchronized (this) {
                    chattArea.append(message + "\n");
                }
            } catch (IOException e) {
                break;
            }
        }
    }
}