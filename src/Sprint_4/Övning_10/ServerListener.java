package Sprint_4.Övning_10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {

    public ServerListener(){
        int port = 57586;
        try (ServerSocket serversocket = new ServerSocket(port)){
            while (true){
                Socket socket = serversocket.accept();
                Server server = new Server(socket);
                server.start();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerListener listener = new ServerListener();
    }
}