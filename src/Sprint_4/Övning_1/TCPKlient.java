package Sprint_4.Övning_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPKlient {
    public static void main(String[] args) {
        int port = 58585;
        InetAddress adress = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(adress, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)
        ) {
            String meddelande = "I love you!";

            while (true) {
                writer.println(meddelande);
                Thread.sleep(5000);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
/*Gör ett litet TCP-program som består av en server och en klient.
Låt servern skicka ett litet meddelande till klienten med några sekunders mellanrum.
*/