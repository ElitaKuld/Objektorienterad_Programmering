package Sprint_4.Övning_12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {
    private MultiWriter multiWriter = new MultiWriter();

    public ServerListener() {
        int port = 12540;

        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                Socket socket = serverSocket.accept();
                Samordnare samordnare = new Samordnare(socket, multiWriter); // kind of a Server
                samordnare.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ServerListener listener = new ServerListener();
    }
}