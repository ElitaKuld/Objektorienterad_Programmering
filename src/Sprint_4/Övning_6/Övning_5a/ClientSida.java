package Sprint_4.Övning_6.Övning_5a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSida {
    public static void main(String[] args) throws IOException {
        int port = 57575;
        InetAddress adress = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(adress, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader readerFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in))

        ) {
            String förfrågan;
            String svarFromServer;

            svarFromServer = readerFromServer.readLine();
            System.out.println(svarFromServer);

            while ((förfrågan = readerFromUser.readLine()) != null) {
                writer.println(förfrågan);
                System.out.println("Vi letar i telefonboken efter: " + förfrågan);

                svarFromServer = readerFromServer.readLine();
                System.out.println(svarFromServer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}