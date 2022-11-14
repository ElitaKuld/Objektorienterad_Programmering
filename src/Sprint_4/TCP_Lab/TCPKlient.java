package Sprint_4.TCP_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPKlient {
    public static void main(String[] args) {
        int port = 53535;
        InetAddress adress = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(adress, port);
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader inFromServer = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()))
        ) {
            String meddelandeToPrint;
            String svarFromServer;

            while ((meddelandeToPrint = reader.readLine()) != null) {
                System.out.println("about to send: " + meddelandeToPrint);
                writer.println(meddelandeToPrint);
                Thread.sleep(2000);
                svarFromServer = inFromServer.readLine();
                System.out.println(svarFromServer);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}