package Sprint_4.Övning_10;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        int port = 57586;
        InetAddress adress = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(adress, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());
             BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String förfrågan;
            Object svarFromServer;

            svarFromServer = inFromServer.readObject();
            if (svarFromServer instanceof Intro) {
                System.out.println(svarFromServer);
            }
            else System.out.println("Vi kan inte tyda svaret från servern.");

            while ((förfrågan = readerFromUser.readLine()) != null) { // användaren angett kombination Ctrl-D
                writer.println(förfrågan.trim());
                System.out.println("Vi letar i telefonboken efter: " + förfrågan);

                svarFromServer = inFromServer.readObject();
                if (svarFromServer instanceof Response)
                    System.out.println(svarFromServer);
                else if (svarFromServer instanceof String)
                    System.out.println(svarFromServer);
                else System.out.println("Vi kan inte tyda svaret på din förfrågan.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}